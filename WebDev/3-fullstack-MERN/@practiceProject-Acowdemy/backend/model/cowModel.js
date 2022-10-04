'use strict'

const mongoose = require('mongoose');
const {Schema, model} = mongoose;

const cowModel = new Schema({
    _id: Number,
    name: String,
    age: Number,
    pattern: String,
    adult: Boolean,
    Home: String
})

const Cow = model('cow', cowModel);
module.exports = {'Cow': Cow};