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
function calculate(radiusArr,cb){
    let Arr=[]
    for(let i=0;i<radiusArr.length;i++){
        Arr.push(cb(radiusArr[i]))
    }
    return Arr;
}//higher order funtion

console.log(calculate(arrRadius,calculateArea))
console.log(calculate(arrRadius,calculateCircumference))
console.log(calculate(arrRadius,calculatediameter))


// git remote add origin https://github.com/ankit14-dev/mrinal-sir.git
// git branch -M main
// git push -u origin main