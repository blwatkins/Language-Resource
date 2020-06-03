const express = require('express');
const bodyParser = require('body-parser');
const colorRoutes = require('./color-routes');

const app = express();

app.use(bodyParser.json());
app.use('/colors', colorRoutes);

module.exports = app;
