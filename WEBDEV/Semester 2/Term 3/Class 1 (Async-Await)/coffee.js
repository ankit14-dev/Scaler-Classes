function placeOrder(drink){
    return new Promise((resolve, reject) => {
        if(drink==="coffee"){
            resolve("Coffee is Placed");
        }else{
            reject("Only Coffee is allowed");
        }
    })
}

function serveOrder(){
    return new Promise((resolve, reject) => {
        resolve("Coffee is Served");
    })
}

placeOrder("coffee").then((data) => {
    console.log(data);
    return serveOrder();
}).then((data) => {
    console.log(data);
}).catch((error) => {
    console.log(error);
})

async function orderCoffee(){
    try{
        let data=await placeOrder("tea");
        console.log(data);
        data=await serveOrder();
        console.log(data);
    }
    catch(error){
        console.log(error);
    }
}
orderCoffee();