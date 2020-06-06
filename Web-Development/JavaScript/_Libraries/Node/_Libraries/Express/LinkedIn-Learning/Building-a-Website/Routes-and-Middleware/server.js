const express = require('express');
const path = require('path');

const indexRoutes = require('./routes/index');

const app = express();
const PORT = 3000;

// using ejs as the template engine
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, 'static')));

app.use('/', indexRoutes);

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
