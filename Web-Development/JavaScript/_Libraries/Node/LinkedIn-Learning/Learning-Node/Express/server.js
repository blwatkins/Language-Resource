let express = require('express');
let bodyParser = require('body-parser');
const Entities = require('html-entities').AllHtmlEntities;
const entities = new Entities();
let app = express();
app.use(express.static(__dirname));
app.use(bodyParser.json()); // expect HTTP requests to come in as JSON
app.use(bodyParser.urlencoded({extended: false}));

var messages = [
    {name: 'Bob', message: 'Hello!'},
    {name: 'Bill', message: 'Hello there!'}
];

app.get('/messages', function(request, response) {
    response.send(messages);
});

app.post('/messages', function(request, response) {
    message = {name: entities.encode(request.body.name), message: entities.encode(request.body.message)};
    messages.push(message);
    console.log(request.body);
    console.log(message);
    response.sendStatus(200);
});

let server = app.listen(8000, printPort);

function printPort() {
    console.log('Server is listening on port ' + server.address().port);
}
