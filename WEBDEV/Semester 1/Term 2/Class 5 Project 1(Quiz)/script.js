const form = document.querySelector(".quiz-form");
const questions = document.querySelectorAll(".question");
const scoreP = document.getElementById("score");
const result = document.querySelector(".result");

var ans = ["D", "B", "C", "B", "D"];

form.addEventListener("submit", (e) => {
  let score = 0;
  e.preventDefault();
  const userAns = [
    form.q1.value,
    form.q2.value,
    form.q3.value,
    form.q4.value,
    form.q5.value,
  ];
  userAns.forEach(function (element, index) {
    if (ans[index] == element) {
      score += 1;
      questions[index].classList.add("correct");
    } else {
      questions[index].classList.add("wrong");
    }
  });
  /* for(let i=0;i<5;i++){
        const q=document.getElementsByName(`q${i+1}`)
        for(let i=0;i<4;i++){
            if(q[i].checked){
                if(q[i].value===ans[i]) {
                    score+=1;
                    q[i].parentElement.parentElement.classList.remove("wrong")
                    q[i].parentElement.parentElement.classList.add("correct")
                    break;
                }
                else{
                    q[i].parentElement.parentElement.classList.add("wrong")
                }
            }
        }
    } */
  result.classList.remove("hide");
  result.querySelector("p").innerText = `You Scored ${score}`;
  result.scrollIntoView();
});
