const express = require('express');

const router = express.Router();

router.get('/', (request, response) => {
    response.render('view', {pageTitle: 'My View'});
});

module.exports = router;
