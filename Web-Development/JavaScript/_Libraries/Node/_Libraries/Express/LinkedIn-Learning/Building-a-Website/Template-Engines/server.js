const express = require('express');
const path = require('path');

const app = express();
const PORT = 3000;

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, 'static')));

app.get('/', (request, response) => {
    response.send('Hello, World!');
});

app.get('/view', (request, response) => {
    response.render('view', {pageTitle: 'My View'});
});

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
