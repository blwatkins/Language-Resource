const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');
const expressValidator = require('express-validator');

const app = express();
const PORT = 3000;

app.use(bodyParser.urlencoded({extended: true}));

// using ejs as the template engine
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, 'static')));

app.get('/', (request, response) => {
    response.send('Hello, World!');
});

app.get('/form', (request, response) => {
    response.render('form', {pageTitle: 'Form'});
});

app.post('/form', [
    expressValidator.check('first_name')
        .trim()
        .isLength({min: 3})
        .escape()
    ], (request, response) => {
        const errors = expressValidator.validationResult(request);
        console.log(request.body);

        if (!errors.isEmpty()) {
            return response.redirect('/form');
        } else {
            const {first_name} = request.body;
            return response.send(`Hello, ${first_name}`);
        }
        
    }
);

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
