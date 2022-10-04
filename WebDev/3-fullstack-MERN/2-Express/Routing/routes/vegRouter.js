const router = require('express').Router();

veg = []

router.get('/viewAll', (req, res) => res.send(veg));
router.post('/create', (req, res) => {
    const name = req.body.name;
    const colour = req.body.colour;
    veg.apend({"name": req.body.name, "colour": req.body.colour})
    res.status(201).send(`${name} (${colour}) added to database`);
})
router.put(`/update/:name`, (req, res) => {
    const name = req.query.name;
    const colour = req.body;
    veg.apend({"name": req.body.name, "colour": req.body.colour})
    res.status(201).send(`${name}'s colour now changed to ${colour}`);
});
router.delete(`/delete/:name`, (res, req) => res.send(`${req.query.name} deleted from database`));

module.exports = router;