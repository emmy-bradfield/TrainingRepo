const mongoose = require('mongoose')
const Schema = mongoose.Schema

count=2;

const User = new Schema(
    {
        _id: {type: Number, required: true},
        email: {type: String, required: true},
        email: {type: String, required: true}
    }
);

module.exports = mongoose.model('users', User)