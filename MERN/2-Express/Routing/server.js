const express = require('express');
const app = express();
const frouter = require('./routes/fruitRouter.js');
const vegouter = require('./routes/vegRouter.js');
const tooter = require('./routes/dairyRouter.js');
const bodyParser = require('body-parser')
const PORT = 8082;

app.use(bodyParser.json());
app.use('fruit', frouter);
app.use('veg', vegouter);
app.use('dairy', tooter);
app.listen(PORT);