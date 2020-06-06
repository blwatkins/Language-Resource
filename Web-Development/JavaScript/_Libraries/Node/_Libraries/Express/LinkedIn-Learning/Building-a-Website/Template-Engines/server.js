const express = require('express');
const path = require('path');

const app = express();
const PORT = 3000;

// using ejs as the template engine
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, 'static')));

app.get('/', (request, response) => {
    response.send('Hello, World!');
});

app.get('/view', (request, response) => {
    response.render('view', {pageTitle: 'My View'});
});

app.get('/layout/template', (request, response) => {
    let fruits = ['apple', 'banana', 'kiwi', 'strawberry', 'lemon'];
    response.render('layout/layout', 
    {pageTitle: 'My Layout with Template', 
    template: 'myTemplate', 
    fruits: fruits});
});

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
