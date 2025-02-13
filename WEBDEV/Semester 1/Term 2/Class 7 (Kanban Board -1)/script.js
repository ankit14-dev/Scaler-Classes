let addBtn = document.querySelector('.add-btn')
let addBtnFlag = false
let taskArea = document.querySelector('.textArea-cont')
let modalCont = document.querySelector('.modal-cont')
let mainContainer = document.querySelector('.main-cont')
let allPriorityColors = document.querySelectorAll('.priority-color')
let removeBtn=document.querySelector('.remove-btn')

let modalTaskColor="lightpink"
let deleteActive=false

let colors=['lightpink','lightgreen','lightblue','black'];

let filterBoxColors=document.querySelectorAll('.color');
let ticketArr=JSON.parse(localStorage.getItem('tickets'))||[];

function init(){
    // let allTickets=localStorage.getItem('tickets')
    if(localStorage.getItem('tickets')){
        // ticketArr=JSON.parse(allTickets)
        // console.log(ticketArr)
        ticketArr.forEach(function(ticket){
            createTicket(ticket.ticketColor,ticket.ticketTask,ticket.ticketId)
        })
    }
}
init()

addBtn.addEventListener('click', function(e){
    addBtnFlag = !addBtnFlag
    
    if(addBtnFlag && !deleteActive){
        // display model pop up
        modalCont.style.display = 'flex'
    }

    else{
        // Hide model pop up
        modalCont.style.display = 'none'
    }
})
function handleRemoval(ticket){
    ticket.addEventListener('click',function(e){
        if(deleteActive){
            ticket.remove()
        }
    })
}

//handle priorith color change
function handlePriorityColorChange(ticket){
    let ticketColorBand=ticket.querySelector('.ticket-color')
    console.log(ticketColorBand)
    ticketColorBand.addEventListener('click',function(){
        let currentColor=ticketColorBand.style.backgroundColor
        let currentColorIndex=colors.findIndex(function(color){
            return color===currentColor
        })
        console.log(currentColorIndex)
        let newIdx=(currentColorIndex+1)%colors.length
        ticketColorBand.style.backgroundColor=colors[newIdx]
        console.log(colors[newIdx])
    })

    /* ticketColorBand.addEventListener('click',function(e){
        let currentColor=e.target.style.backgroundColor
        let idx=colors.indexOf(currentColor)
        console.log(idx)
        let newIdx=(idx+1)%colors.length
        e.target.style.backgroundColor=colors[newIdx]
        console.log(colors[newIdx])
        
    }) */
}
//hangle lock
function handleLock(ticket){
    let lock=ticket.querySelector('.ticket-lock')
    let lockIcon=lock.querySelector('i')
    let taskArea=ticket.querySelector('.task-area')
    lockIcon.addEventListener('click',function(e){
        e.target.classList.toggle('fa-lock')
        e.target.classList.toggle('fa-lock-open')
        if(lockIcon.classList.contains('fa-lock')){
            taskArea.setAttribute('contenteditable','false')
        }
        else{
            taskArea.setAttribute('contenteditable','true')
        }
    })

    taskArea.addEventListener('keydown',function(e){
        if(e.key=="Enter"){
            if(!lockIcon.classList.contains('fa-lock')){
                lockIcon.classList.toggle('fa-lock')
                lockIcon.classList.toggle('fa-lock-open')
                taskArea.setAttribute('contenteditable','false')
            }
        }
    })

}
removeBtn.addEventListener('click',function(e){
    if(deleteActive){
        deleteActive=false
        e.target.style.color='white'
    }
    else{
        deleteActive=true
        e.target.style.color='red'
        /* let allTickets=document.querySelectorAll('.ticket-cont')
        allTickets.forEach(function(ticket){
            ticket.addEventListener('click',function(e){
                if(deleteActive){
                    e.target.remove()
                }
            })
        }) */

    }
    
})

//creates a function to create a ticket
function createTicket(ticketColor,task,id){
    let ticket =document.createElement('div')
    ticket.classList.add('ticket-cont')
    ticket.innerHTML=`<div class="ticket-color" style="background-color:${ticketColor}" ></div>
             <div class="ticket-id">${id}</div>
             <div class="task-area">${task}</div>
              <div class="ticket-lock">
                <i class="fa-solid fa-lock"></i>
              </div>`;
    
    mainContainer.appendChild(ticket)
    handleRemoval(ticket)
    handlePriorityColorChange(ticket)
    handleLock(ticket)

    ticketArr.push({ticketId:id,ticketColor:ticketColor,ticketTask:task})
    updateLocalStorage();
    console.log(ticketArr)
}

modalCont.addEventListener('keydown', function(e){
    if(e.key=='Shift'){
        const task = taskArea.value
        const id=shortid()
        console.log(task," -> ",id);
        createTicket(modalTaskColor,task,id)
        modalCont.style.display = 'none';
        addBtnFlag = false
        taskArea.value = ''
    }
})

//adding event listener to all priority colors
allPriorityColors.forEach(function(colorElem){
    colorElem.addEventListener('click',function(e){
        allPriorityColors.forEach(function(priorityElem){
            priorityElem.classList.remove('active')
        })
        colorElem.classList.add('active')
        modalTaskColor = colorElem.classList[0]
        // console.log(modalTaskColor)
    })
})

filterBoxColors.forEach(function(color){
    color.addEventListener('click',function(e){
        let selecterColor=e.target.classList[0]
        let allTickets=document.querySelectorAll('.ticket-cont')
        allTickets.forEach(function(ticket){
            let ticketColor=ticket.querySelector('.ticket-color').style.backgroundColor
            if(ticketColor==selecterColor){
                ticket.style.display='block'
            }
            else{
                ticket.style.display='none'
            }
        })
    })
})

//set Local Storage
function updateLocalStorage(){
    localStorage.setItem('tickets',JSON.stringify(ticketArr))
}
