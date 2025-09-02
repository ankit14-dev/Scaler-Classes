const mongoose = require('mongoose');
const productSchema = new mongoose.Schema({
    productName: {
        type: String,
        required: true
    },
    product_price: {
        type: Number,
        required: true

    },
    isInStock: {
        type: Boolean,
        required: true
    },
    catagory: {
        type: String
    },
});

let ProductModel=mongoose.model('products', productSchema);
module.exports=ProductModel;