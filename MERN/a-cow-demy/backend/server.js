const express = require("express");
const app = express();
const cors = require("cors");
const PORT = 4000;
app.use(express.json());
app.use(cors());

const mongoose = require("mongoose");
const cowRouter = require("./routes/cowRoute.js");
app.use("/cows",cowRouter);
const router = express.Router();

mongoose.connect('mongodb://127.0.0.1:27017/barn',{useNewUrlParser : true},
(error) => {
    if (error) {
        console.log("Can't connect to MongoDB");
    } else {
        console.log("Connected to database");
    }
});

const connection = mongoose.connection;


connection.once("open", function () {
    console.log("Connection with MongoDB was successful");
});

app.use("/", router);

const server = app.listen(PORT, function () {
    console.log("Server is running on Port: " + PORT);
});