const mongoose = require('mongoose');
const express = require('express');
const cors = require('cors');
const app = express();
const port = 8082;
app.use(express.json());
app.use(cors());
app.listen(port);
mongoose.connect('mongodb://localhost:27017/ims', {useNewUrlParser : true},
(error) => {
    if (error) {
        console.log("Unable to connect")
    } else {
        console.log("Connect successful")
    }
})
