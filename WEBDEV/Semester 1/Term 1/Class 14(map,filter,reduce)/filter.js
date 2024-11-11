let myarr=[1,4,3,13,12,17,20]

//Filter out all the even numbers in the new array
//create a function for this

function isEven(number){
    return (number%2==0)
}

let arr=myarr.filter(isEven)
console.log(arr);

const transactions=[-1000,2000,8000,-4000]
function getWidrawals(transaction){
    return transaction<0
}
console.log(transactions.filter(getWidrawals))