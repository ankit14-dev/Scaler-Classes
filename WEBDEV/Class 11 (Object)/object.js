let cap={
    firstName:"Steve",
    lastName:"Rogers",
    age: 35,
    address:{
        city:"Brooklyn",
        state:"NY"
    },
    allies:["Captain America","Thor","Hulk"],
    sayHi: function(){
        console.log("Hello");
    }
}

//dot notation

console.log(cap.firstName);
cap.sayHi();
cap["movies"]=["Infinity War","End Game"];
console.log(cap);
cap.movies.push("Avengers");
console.log(cap);

delete cap.age;
console.log(cap);

//Bracket Notation -HW
console.log(cap["firstName"]);