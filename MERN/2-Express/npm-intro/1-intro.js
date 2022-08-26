'use strict'

const express = require('express');
const app = express()
const server = app.listen(8080, () => {
    console.log(`Server started on port number ${server.address().port}`);
})


app.get(`/`,(req, res) => console.log('Hello World!'));