let ticketsArr = JSON.parse(localStorage.getItem('tickets')) || [];

function init() {
    if (localStorage.getItem('tickets')) {
        ticketsArr.forEach(function (ticket) {
            createTicket(ticket.ticketColor, ticket.ticketTask, ticket.ticketId);
        });
    }
}

init();

function createTicket(ticketColor, ticketTask, ticketId) {
    let ticket = document.createElement('div');
    ticket.classList.add('ticket');
    ticket.innerHTML = `<div class="ticket-color" style="background-color:${ticketColor}"></div>
    <div class="ticket-id">#${ticketId}</div>
    <div class="ticket-task">${ticketTask}</div>`;
    mainCont.appendChild(ticket);
    handleRemoval(ticket);
    handlePriorityColorChange(ticket);
}

function handleRemoval(ticket) {
    ticket.addEventListener('click', function (e) {
        ticket.remove();
        let ticketId = ticket.querySelector('.ticket-id').innerText.slice(1);
        ticketsArr = ticketsArr.filter(function (ticket) {
            return ticket.ticketId != ticketId;
        });
        localStorage.setItem('tickets', JSON.stringify(ticketsArr));
    });
}

function handlePriorityColorChange(ticket) {
    let ticketColorDiv = ticket.querySelector('.ticket-color');
    ticketColorDiv.addEventListener('click', function (e) {
        let colors = ['pink', 'blue', 'green', 'black'];
        let currentColor = e.target.style.backgroundColor;
        let idx = colors.indexOf(currentColor);
        idx++;
        idx = idx % 4;
        e.target.style.backgroundColor = colors[idx];
        let ticketId = ticket.querySelector('.ticket-id').innerText.slice(1);
        ticketsArr = ticketsArr.map(function (ticket) {
            if (ticket.ticketId == ticketId) {
                ticket.ticketColor = colors[idx];
            }
            return ticket;
        });
        localStorage.setItem('tickets', JSON.stringify(ticketsArr));
    });
}