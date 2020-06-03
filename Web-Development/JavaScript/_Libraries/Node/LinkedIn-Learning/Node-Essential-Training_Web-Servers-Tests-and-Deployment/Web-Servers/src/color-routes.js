const express = require('express');
const library = require('./library');
let colors = require('../data/colors.json');

const router = new express.Router();

router.get('/', (request, response) => {
    response.json(colors);
});

router.post('/', (request, response) => {
    let colorName = request.body.color;
    let colorHex = request.body.hex;
    let color = {color: colorName, hex: colorHex};
    colors.push(color);
    library.saveColors(colors);
    response.json({
        status: "success",
        term: color
    });
});

router.delete('/:color', (request, response) => {
    colors = colors.filter(color => color.color !== request.params.color);
    library.saveColors(colors);
    response.json({
        status: "success",
        removed: request.params.color,
        colorsCount: colors.length
    });
});

module.exports = router;
