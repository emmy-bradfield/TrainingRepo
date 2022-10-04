const router = require('express').Router();
const item = require('../schemas/item.js')

router.get("/readAll", (req, res) => {
    console.log("You're reading items");
    res.status(200).send("READING ITEMS")
})

router.post("/create", (req, res) => {
    const item = new Item(req.body);
    item.save().then((result) => {
        res.status(2001).send(`${result.name} added to database`)
    })

})

module.exports = router;