const fs = require('fs');
const path = require('path');

function saveColors(colors) {
    let filePath = path.join(__dirname, '..', 'data', 'colors.json');
    fs.writeFile(filePath, JSON.stringify(colors, null, 4), (error) => {
        if (error) {
            throw error;
        }
    });
}

module.exports = {saveColors};
