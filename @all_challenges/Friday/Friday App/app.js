// import express
const express = require('express');

// import nedb
const Datastore = require('nedb');

// import bodyParser
const bodyParser = require('body-parser');

// set up the app
const app = express();

// set up a new database
const db = new Datastore();

// port for the app to run on
const PORT = 8082;

// global variable for id
let id = 1;

// add body-parsing functionality to the app (needed for sending data)
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: true
}));

// get app to serve static files from the public directory
app.use(express.static(__dirname + '/public'));


// CREATE (Post)
app.post('/create', (req,res) => {
    // log that we are running the create operation
    console.log(`\nCreate - POST`);
    // create an item from the request body
    let item = {_id:id.toString(),name:req.body.name,description:req.body.description,cost:req.body.cost,};
    // increment our id by one
    id++;

    // insert the item into our Database
    db.insert(item, (err, item) => {
        //if there is an error, send back the error
        if (err) res.send(err);
        // otherwise 201 - Created and the item
        res.status(201).send(item);
        //log that item to console
        console.log(`Created item: ${JSON.stringify(item)}`);
    });
});

// READ ALL (Get)
app.get('/read', (req, res) => {
    // log that we are running the read operation
    console.log(`\nRead - GET ALL`);

    // reading all items from database
    db.find({}, (err, items) => {
        //if there is an error, send back the error
        if (err) res.send(err);
        // otherwise 200 - OK
        res.status(200).send(items);
        //log the items to console
        console.log(`Reading items: ${JSON.stringify(items)}`);
    });
});

// READ ONE (Get)
app.get('/read/:id', (req,res) => {
    // log that we are running the read operation
    console.log(`\nRead - GET ONE`);

    // reading item from database by id
    db.find({_id : req.params.id}, (err, item) => {
        //if there is an error, send back the error
        if (err) res.send(err);
        // otherwise 200 - OK
        res.status(200).send(item);
        //log the item to console
        console.log(`Reading item: ${JSON.stringify(item)}`);
    });
});

// UPDATE (Put)
app.put('/update/:id', (req,res) => {
    console.log(`\nUpdate - PUT`);
    // create a new item object
    let updatedItem = {_id:req.params.id,name:req.body.name,description:req.body.description,cost:req.body.cost};
    // find data in database BY using the id
    // send the new item
    db.update({_id : req.params.id}, updatedItem, (err, itemID) => {
      // if there is an error, send back the error
      if (err) res.send(err);
      // otherwise 200 - OK and send back the item ID
      res.status(200).send(`Updated item: ${itemID}`);
      // log the item ID being returned
      console.log(`Updated item: ${itemID}`);
    });
  });

// DELETE (Delete)
app.delete('/delete/:id', (req,res) => {
    // log that we are running the delete operation
    console.log(`\nDelete - DELETE`);

    // deleting item from database by id
    db.remove({_id : req.params.id}, (err, itemID) => {
        //if there is an error, send back the error
        if (err) res.send(err);
        // otherwise 200 - OK
        res.sendStatus(200);
        //log the item id to console
        console.log(`Deleted item with id: ${itemID}`);
    });
});

// export the app and the itemBuilder
app.listen(PORT, () => {
    console.log(`API Listening on http://localhost:${PORT}`);
});