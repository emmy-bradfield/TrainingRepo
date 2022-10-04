const mongoose = require('mongoose');
const {Schema, model} = mongoose;

const supplierSchema = new Schema({
    name: String,
    contractLength: Number,
    SPOC: String
})

const itemSchema = new Schema({
    itemName: String,
    itemCost: Number,
    itemStock: Number,
    supplier: [supplierSchema]
})

const Item = model('item', itemSchema);
module.exports = {'item' : Item}