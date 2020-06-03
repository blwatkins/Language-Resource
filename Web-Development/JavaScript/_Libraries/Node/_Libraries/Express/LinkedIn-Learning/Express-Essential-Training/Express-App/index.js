import express, { response, request } from 'express';
import data from './data/data.json'; // data downloaded from https://www.mockaroo.com/

const app = express();
const PORT = 3000;

// add middleware to the path
app.use(express.static('public'));
app.use('/images', express.static('images'));
// app.use(express.json()); // use json request data
app.use(express.urlencoded({extended: true})); // use url encoded request data

// get data
app.get('/', (request, response) => {
    response.json(data);
});

app.get('/item/:id', (request, response) => {
    // begin middleware
    console.log(request.params.id);
    let user = Number(request.params.id);
    console.log(user);
    console.log(data[user - 1]);
    console.log(`request from ${request.originalUrl}`);
    console.log(`request method ${request.method}`);
    // end middleware
    response.json(data[user - 1]);
});

app.get('/flowerImage', (request, response) => {
    response.download('./images/flowers_1.jpg'); // download a file to the client
});

app.get('/flower', (request, response) => {
    response.redirect('/flowerImage'); // redirect to a site
});

// add data
app.post('/newItem', (request, response) => {
    console.log(request.body);
    response.send(`A POST request with /newItem on port ${PORT}`);
});

// update data
app.put('/item', (request, response) => {
    response.send(`A PUT request with /item on port ${PORT}`);
});

// remove data
app.delete('/item', (request, response) => {
    response.send(`A DELETE request with /item on port ${PORT}`);
});

// chaining routes
app.route('/person')
    .get((request, response) => {
        response.send(`A GET request with /person on port ${PORT}`);
    })
    .put((request, response) => {
        response.send(`A PUT request with /person on port ${PORT}`);
    })
    .delete((request, response) => {
        response.send(`A DELETE request with /person on port ${PORT}`);
    });

app.get('/error', (request, response) => {
    throw (new Error());
});

// error handling middleware
app.use((error, request, response, next) => {
    console.error('An error has occured');
    response.status(500).send('An error has occurred');
});

app.listen(PORT, () => {
    console.log(`Your server is running on port ${PORT}`);
});
