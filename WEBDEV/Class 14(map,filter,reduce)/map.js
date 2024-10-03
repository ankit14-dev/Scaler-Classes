//map method
let nums = [1, 2, 3, 4, 5];
let arry=[]
function makeSqArry(nums) {
  let newArr = [];
  nums.map((i) => {
    newArr.push(i * i);
  });
  return newArr;
}

arry=makeSqArry(nums)
console.log(arry)



//Exercises

const transactions=[1000,2000,8000,4000]

const inrtousd_rate=83

function converts(transaction){
  return transaction/inrtousd_rate;
}

let convertedAmount=transactions.map(converts)
console.log(convertedAmount)