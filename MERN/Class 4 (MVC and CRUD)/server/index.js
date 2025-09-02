const express = require('express');
const dotenv = require('dotenv');
const { connectToMongo } = require('./connection.js');
const productRoutes = require('./routes/product.route.js');

dotenv.config(); // load .env into process.env

const app = express();
app.use(express.json());

const PORT = process.env.PORT || 3000;
const DB_URL = process.env.DB_URL || 'mongodb://127.0.0.1:27017/mydb';


app.get('/', (req, res) => {
  res.send('Hello World!');
});
// Import and use product routes
app.use('/api', productRoutes);


// Start server after DB connection (handles async connectToMongo)
connectToMongo(DB_URL);
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});