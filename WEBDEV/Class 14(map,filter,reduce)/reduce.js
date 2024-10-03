let numbers=[1,2,3,4,5]

function sumAll(sum,num){
    //here sum is an accumulator
    sum+=num
    return sum

}

let total=numbers.reduce(sumAll,0) //0 is the initial value of the accumulator
console.log(total)
