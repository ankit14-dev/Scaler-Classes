const ProductModel = require('../models/product.modal.js');

async function createProduct(req, res) {

    // const body = req.body;
    // await ProductModel.create({
    //     productName: body.productName,
    //     product_price: body.product_price,
    //     isInStock: body.isInStock,
    //     catagory: body.catagory
    // })

    try {
        const newProduct = new ProductModel(req.body);
        const savedProduct = await newProduct.save();
        res.status(201).json(savedProduct);
    } catch (error) {
        res.status(400).json({ message: error.message });
    }
}

module.exports = { createProduct };