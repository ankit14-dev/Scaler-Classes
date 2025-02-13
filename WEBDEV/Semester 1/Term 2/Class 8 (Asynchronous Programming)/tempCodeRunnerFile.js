const fs=require('fs');

fs.readFile('f1.txt',function(err,data){
    if(err){
        console.log(err);
    }
    else{
        console.log(data.toString());
    }

});
fs.readFile('f2.txt',function(err,data){
    if(err){
        console.log(err);
    }
    else{
        console.log(""+data);
    }

});
fs.readFile('f3.txt',function(err,data){
    if(err){
        console.log(err);
    }
    else{
        console.log(""+data);
    }

});