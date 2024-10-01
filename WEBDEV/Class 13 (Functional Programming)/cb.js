function firstName(name,cb,cbAge){
    console.log(name)
    cb("Kumar")
    cbAge(54)
}

function lastName(lastname){
    console.log(lastname)
}
function printAge(age){
    console.log(age)
}

firstName('Ankit',lastName,printAge)
// lastName('kumar')