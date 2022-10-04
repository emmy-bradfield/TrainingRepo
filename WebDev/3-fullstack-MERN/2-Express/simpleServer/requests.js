'use strict'
const express = require('express');
const app = express()
const server = app.listen(8082, () => {
    console.log(`Server started on ${server.address().port}`);
})

app.use(express.json());

// CREATE - take in a body and print it out (use postman)
app.post('/create', (req) => {
    console.log(req.body);
})

// READ - take in a URL query and print it out
app.get('/read/:id', (req) => {
    console.log(`Reading salesperson #${req.params.id}`);
})

// UPDATE - take in an ID and a body and print both out
app.put('/update', (req) => {
    console.log(`Salesperson #${req.query.id} updated to`);
    console.log(req.body);
})

// DELETE - take in an ID and return it
app.delete('/delete/:id', (req) => {
    console.log(`Deleted salesperson #${req.params.id}`);
})