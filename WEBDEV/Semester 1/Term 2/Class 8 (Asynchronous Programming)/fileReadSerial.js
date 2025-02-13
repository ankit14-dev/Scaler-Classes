// const fs=require('fs');

// async function filereadCb1(){
//     if(err){
//         console.log(err);
//     }
//     else{
//         console.log(""+data);
        
//     }
// }
// async function filereadCb2(){
//     if(err){
//         console.log(err);
//     }
//     else{
//         console.log(""+data);
//     }
// }
// async function filereadCb3(){
//     if(err){
//         console.log(err);
//     }
//     else{
//         console.log(""+data);
//     }
// }

// const data=await fs.readFile('f1.txt',filereadCb1);
// fs.readFile('f2.txt',filereadCb2);
// fs.readFile('f3.txt',filereadCb3);


// console.log("---------------------------------");

// console.log("End of the file");






const FileSystem = require("fs");

console.log("start");

FileSystem.readFile("f1.txt", function (err , data) {
   if(err){
    console.log("Cannot read File")
   }
   else{
    console.log("This is file 1 data -> " + data)
   }
});

FileSystem.readFile("f2.txt", function (err , data) {
    if(err){
     console.log("Cannot read File")
    }
    else{
     console.log("This is file 2 data -> " + data)
    }
 });

 FileSystem.readFile("f3.txt", function (err , data) {
    if(err){
     console.log("Cannot read File")
    }
    else{
     console.log("This is file 3 data -> " + data)
    }
 });



console.log("End");

function p1(){
    return new Promise((resolve, reject) => {
        FileSystem.readFile("f1.txt", function (err , data) {
            if(err){
                reject("Cannot read File")
            }
            else{
                resolve(data)
            }
        });
    })
}





p1().then((data) => {
    console.log("This is file 1 data -> " + data)
    return new Promise((resolve, reject) => {
        FileSystem.readFile("f2.txt", function (err , data) {
            if(err){
                reject("Cannot read File")
            }
            else{
                resolve(data)
            }
        });
    })
}).then()