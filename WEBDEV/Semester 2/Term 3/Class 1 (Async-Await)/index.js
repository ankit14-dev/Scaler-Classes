const p1=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Data Fetched");
    },10000)
})
const p2=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Data Fetched");
    },15000)
})

async function fetchData(){
    console.log("Scaler");
    
    let data=await p1;
    console.log(data);
    console.log("Data 1 Fetched Successfully");
    data=await p2;
    console.log(data);
    console.log("Data 2 Fetched Successfully");
}

async function printHello(){
    setTimeout(()=>{
        return "Hello";
    },1000)
}

fetchData();

let data=printHello();
console.log(data);
