'use strict'

const MONGOOSE = require('mongoose');
const SCHEMA = MONGOOSE.Schema;

const ARTIST_SCHEMA = new SCHEMA({
    _id: Number,
    name: {
        type: String,
        required: true
    },
    age: Number,
    type: String
})

const ALBUM_SCHEMA = new SCHEMA({
    _id: Number,
    title: String,
    release: String,
    genre: String
})

const SONG_SCHEMA = new SCHEMA({
    _id: Number,
    title: {
        type: String,
        required: true
    },
    length: Number,
    album: [ALBUM_SCHEMA],
    artist: [ARTIST_SCHEMA]
})

module.exports = MONGOOSE.model("Song", SONG_SCHEMA);