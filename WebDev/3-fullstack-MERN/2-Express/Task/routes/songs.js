'use strict'

const ROUTER = require('express').Router();
const SONG = require('../schemas/songs.js');
const {NotFound} = require('../errors.js');

// POST
ROUTER.post('/create', async (req, res, next) => {
    const DOC = new SONG(req.body);
    try {
        const CREATED = await DOC.save();
        res.status(201).send(CREATED);
    } catch (err) {
        next(new Error(err.messages))
    }
});

// GET
ROUTER.get('/getAll', async (req, res, next) => {
    try {
        const SONGS = await SONG.find();
        (SONGS.length) ? res.send(SONGS) : next(new Error("ERROR: No songs in database"));
    } catch (err) {
        next(new Error(err.message));
    }
});

ROUTER.get('/get/:id', async(req, res, next) => {
    try {
        const FOUND = await SONG.findById(req.params.id);
        (FOUND)? res.send(FOUND) : next(new NotFound("ERROR: Could not find song with that ID"));
    } catch(err) {
        next(new Error(err.message));
    }
});

// PUT
ROUTER.put('/update/:id', async(req, res, next) => {
    try{
        const UPDATED = await SONG.findByIdAndUpdate(
            {_id: req.params.id},
            req.body,
            {new: true}
        );
        (UPDATED)? res.status(200).send(UPDATED) : next(new NotFound("ERROR: Could not find song with that ID"));
    } catch(err) {
        next(new Error(err.message));
    }
});

// DELETE
ROUTER.delete('/delete/:id', async(req, res, next) => {
    try {
        const DELETED = await SONG.findByIdAndDelete(req.params.id);
        (DELETED)? res.status(204).send() : next(new NotFound("ERROR: Could not find song with that ID"));
    } catch(err) {
        next(new Error(err.message));
    }
});

module.exports = ROUTER;