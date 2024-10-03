const transactions=[-1000,2000,8000,-4000]
//get deposits convert to usd and provide sum

function getDeposit(amount){
    return amount>0
}

const deposits=transactions.filter(getDeposit)
console.log(deposits)
const rates=83
function convertToUsd(amount){
    return amount/rates
}

const amountInUSD=deposits.map(convertToUsd)
console.log(amountInUSD)

function totalAmt(sum,amt){
    sum+=amt
    return sum
}
let total=amountInUSD.reduce(totalAmt,0).toFixed(2)
console.log(total)

//Method Chaining
console.log(transactions.filter(getDeposit).map(convertToUsd).reduce(totalAmt,0))