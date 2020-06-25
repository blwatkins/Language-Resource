const express = require('express');
const bodyParser = require('body-parser');
const expressValidator = require('express-validator');

const app = express();
const PORT = 3000;

app.use(bodyParser.json());

validation = [
    expressValidator.check('first_name')
        .trim()
        .isLength({min: 3})
        .escape()
];

app.get('/', (request, response) => {
    response.send('Hello, World!');
});

app.post('/api', validation, (request, response) => {
    const errors = expressValidator.validationResult(request);
    console.log(request.body);
    let result = null;

    if (!errors.isEmpty()) {
        result = response.json({errors: errors.array()});
    } else {
        const {first_name} = request.body;
        result = response.json({firstName: first_name, message: `Hello, ${first_name}`});
    }

    return result;
});

app.listen(PORT, () => {
    console.log(`Express Server listening on port ${PORT}`);
});
