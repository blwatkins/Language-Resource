// do not throw error from express route or middleware

const express = require('express');
const path = require('path');
const createError = require('http-errors');

const app = express();
const PORT = 3000;

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, 'static')));

app.get('/', (request, response) => {
    response.send('Hello, World!');
});

app.get('/throw', (request, response, next) => {
    return next(new Error('An error occurred'));
});

app.use((request, response, next) => {
    return next(createError(404, 'File not found'));
});

// error handling middleware
app.use((error, request, response, next) => {
    console.error(error);
    response.locals.message = error.message;
    const status = error.status || 500;
    response.locals.status = status;
    response.status(status);
    response.render('error');
});

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
