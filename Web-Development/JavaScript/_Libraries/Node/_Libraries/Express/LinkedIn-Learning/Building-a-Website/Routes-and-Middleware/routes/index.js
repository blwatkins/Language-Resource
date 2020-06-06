const express = require('express');

const viewRoutes = require('./view');

const router = express.Router();

router.get('/', (request, response) => {
    response.send('Hello, World!');
});

router.use('/view', viewRoutes);

module.exports = router;
