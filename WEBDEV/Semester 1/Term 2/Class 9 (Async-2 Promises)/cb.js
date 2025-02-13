function prepareIngredients(cb) {
  setTimeout(function () {
    console.log("Ingredients Prepared");
  }, 2000);
  cb();
}

function cookDish(cb) {
  setTimeout(function () {
    console.log("Dish cooked");
  }, 5000);
  cb();
}

function serveDish(cb) {
  setTimeout(function () {
    console.log("Dish Served");
  }, 6000);
  cb();
}

function cleanUp(cb) {
  setTimeout(function () {
    console.log("Table cleaned");
  }, 4000);
  cb();
}
function provideFeedback() {
  setTimeout(function () {
    console.log("Feedback Provided");
  }, 3000);
}


// //Callback Hell
// prepareIngredients(function () {
//   cookDish(function () {
//     serveDish(function () {
//       cleanUp(function(){
//         provideFeedback();
//       });
//     });
//   });
// });

// //Promise
const prepareIngredientsPromise = new Promise((resolve, reject) => {

});
