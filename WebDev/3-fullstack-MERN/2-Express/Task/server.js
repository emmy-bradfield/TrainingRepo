const MONGOOSE = require('mongoose');
const EXPRESS = require('express');
const CORS = require('cors');
const ROUTES = require('./routes/songs.js')
const ERROR_HANDLERS = require("./errors/errorHandlers.js");
const APP = EXPRESS();
const PORT = 8082;

APP.use(CORS());
APP.use(EXPRESS.json());
APP.use(ROUTES);
APP.use(ERROR_HANDLERS.logError);
APP.use(ERROR_HANDLERS.sendError);

MONGOOSE
    .connect("mongodb://127.0.0.1:27017/songs", {useNewUrlParser: true})
    .then(() => {
        console.log("Database connection successful");
        APP.listen(PORT, (err) => {
            if (err) console.log(err);
            console.log(`App listening at http://localhost:${PORT}`)
        });
    }).catch((err) => {
        console.log("Database connection failed");
        console.log(err);
    });

