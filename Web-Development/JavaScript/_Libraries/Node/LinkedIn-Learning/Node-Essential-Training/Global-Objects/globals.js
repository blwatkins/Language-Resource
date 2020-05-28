const path = require('path');

console.log(__dirname); // directory name
console.log(__filename); // current file name
console.log(`The file name is ${path.basename(__filename)}`);
