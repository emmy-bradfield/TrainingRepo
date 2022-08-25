'use strict'
const express = require('express');
const app = express()
const server = app.listen(8082, () => {
    console.log(`Server started on ${server.address().port}`);
})

app.use(express.json());

// CREATE - take in a body and print it out (use postman)
app.post('/create', (req, res) => {
    res.send(`Created new salesperson:${req.body.name}`)
    res.send(req.body).status(200);
})

// READ - take in a URL query and print it out
app.get('/read/:id', (req, res) => {
    res.send(`Reading salesperson #${req.params.id}`).status(200);
})

// UPDATE - take in an ID and a body and print both out
app.put('/update', (req, res) => {
    res.send(`Salesperson #${req.query.id} updated`).status(200);
})

// DELETE - take in an ID and return it
app.delete('/delete/:id', (req, res) => {
    res.send(`Deleted salesperson #${req.params.id}`).status(200);
})