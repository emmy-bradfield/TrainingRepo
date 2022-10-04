const router = require('express'.Router())

let lizards = ["Elizabeth, Lizanardo, Sir Lizardolot, Lizzy"]

router.get('/', (req, res) => res.send("I am a lizard"));
router.get('/readAll', (req, res) => res.send(lizards));
router.get('read/:id', (req, res) => res.send(lizards[req.params.id]));
router.delete('/delete:id', (req, res) => res.send(lizards.splice(req.params.id, 1)));
router.post('/create', (req, res) => {
    const lizard = req.body.lizard;
    lizards.push(lizard);
    res.status(201).send(`${lizards} added successfully`)
});
router.post('/replace/:index', (req, res) => {
    const lizard = req.query.lizard;
    const index = req.params.index;
    const old = lizards[index];
    lizards[index] = lizard;
    res.status(202).send(`${old} successfully replaced with ${lizard}`);
});

module.exports = router;