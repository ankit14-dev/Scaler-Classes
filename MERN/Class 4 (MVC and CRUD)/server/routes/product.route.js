const express = require('express');

const router=express.Router();
const {createProduct} = require('../controllers/productController.js');

// Create a new product
router.post('/products', createProduct);

// Get all products
router.get('/products', async (req, res) => {
    try {
        const products = await ProductModel.find();
        res.status(200).json(products);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

module.exports=router;