const express = require('express');
const app = express()
const routes = require('./lizardRouter.js');
const bodyParser = requrie('body-parser');
app.use(bodyParser.json());
app.use(routes);
app.listen(8082);