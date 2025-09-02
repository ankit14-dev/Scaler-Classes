const mongoose=require('mongoose');

async function connectToMongo(dbUrl){
    return mongoose.connect(dbUrl).then(()=>{
        console.log("Connected to MongoDB");
    }).catch((err)=>{
        console.log("Error connecting to MongoDB:", err);
    });
}
module.exports=connectToMongo;