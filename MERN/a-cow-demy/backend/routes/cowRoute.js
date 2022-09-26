'use strict'

const cowRouter = require('express').Router();
const { Cow } = require('../model/cowModel.js');

cowRouter.route('/barn').get((req, res) =>{
    Cow.find()
    .then(cows => res.json(cows))
    .catch((err) => res.status(400).json('Error: ' + err));
});

cowRouter.route('/cow/:_id').get((req, res) => {
    Cow.findOne({"_id" : req.params._id})
    .then(cows => res.json(cows))
    .catch((err) => res.status(400).json('Error: ' + err));
});

cowRouter.route('/newCow').post((req, res) => {
    const _id = req.body._id;
    const name = req.body.name;
    const age = req.body.age;
    const pattern = req.body.pattern;
    const adult = req.body.adult;
    const home = req.body.home;

    const newCow = new Cow({
        _id,
        name,
        age,
        pattern,
        adult,
        home
    });

    newCow.save()
    .then(() => res.json('new cow: ' + newCow))
    .catch((err) => res.status(400).json('Error: ' + err))
});

cowRouter.route('/update/:_id').post((req, res) => {
    Cow.findById(req.params._id)
    .then(cow => {
        cow.name = req.body.name;
        cow.age = req.body.age;
        cow.pattern = req.body.pattern;
        cow.adult = req.body.adult;
        cow.home = req.body.home;

        cow.save()
        .then(() => res.json('Cow Updated: ' + cow))
        .catch((err) => res.status(400).json('Error: ' + err))
    })
    .catch((err) => res.status(400).json('Error: ' + err));
});

cowRouter.route('/delete/:_id').delete((req, res) => {
    Cow.findByIdAndDelete(req.params._id)
    .then(() => res.json('The cow has been set free into the wild'))
    .catch((err) => res.status(400).json('Error: ' + err));
});

module.exports = cowRouter;