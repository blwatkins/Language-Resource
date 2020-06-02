import express from 'express';
import data from './data/data.json';

const app = express();
const PORT = 3000;

app.listen(PORT, () => {
    console.log(`Your server is running on port ${PORT}`);
});

// add middleware to the path
app.use(express.static('public'));
app.use('/images', express.static('images'));

// get data
app.get('/', (request, response) => {
    response.json(data);
});

app.get('/item/:id', (request, response) => {
    console.log(request.params.id);
    let user = Number(request.params.id);
    console.log(user);
    console.log(data[user - 1]);
    response.json(data[user - 1]);
});

// add data
app.post('/newItem', (request, response) => {
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
