const form=document.querySelector('.feedback-form');
let userNameRegex=/^[a-z0-9]{3,12}$/
let feedbackRegex=/^.{20,50}$/;
form.addEventListener('submit',function(e){
    e.preventDefault();  // prevent form from submitting normally
    var username=form.username.value;
    var feedback=form.feedback.value;
    console.log(username);
    console.log(feedback);
    const p=document.querySelector('p');
    p.style.color="red";
    if(!userNameRegex.test(username)){
        p.innerText="username is not valid";
    }    
    else if(!feedbackRegex.test(feedback)){
        p.innerText="feedback is not valid";
    }
    else{
        p.innerText="Validation successful";
        p.style.color="green";
    }
    // email validation /^[a-z0-9]{3,12}@[a-z]{1,}\.[a-z]{1,12}$/gm
    // phone no validation /^[+]91[0-9]{10}/gm
    // password validation /(?=.*?[a-zA-Z0-9!@#]).{8,}/gm
    //username validation /^[a-z][a-z_]{3,16}$/gm
    //Date validation /(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0,1,2])\/[0-9]{4}/gm
    //url validation /(http:\/\/|https:\/\/)[a-z0-9]{1,}\.[a-z]{1,}(\/|\?[a-z0-9#\.=]{1,})/gm
    //zip code validation /^[0-9]{5}-(\d{4})?$/gm
})