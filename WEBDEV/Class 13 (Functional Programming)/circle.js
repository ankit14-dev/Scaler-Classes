let arrRadius=[1,2,4,6,8]

function calculateArea(radius){
    return 3.14*radius*radius
}
function calculatediameter(radius){
    return 2*radius
}

function calculateCircumference(radius){
    return 2*3.14*radius    
}
function calculate(radiusArr,logic){
    let Arr=[]
    for(let i=0;i<radiusArr.length;i++){
        Arr.push(logic(radiusArr[i]))
    }
    return Arr;
}//higher order funtion

console.log(calculate(arrRadius,calculateArea))
console.log(calculate(arrRadius,calculateCircumference))
console.log(calculate(arrRadius,calculatediameter))
