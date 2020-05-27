let fs = require('fs'); // import file system library

function printData(error, text) {
	// convert text to JSON
	console.log(text);
	let data = JSON.parse(text);
	console.log(data);
	console.log(data.name);
}

fs.readFile('./data.json', 'utf-8', printData);

// directly read JSON object
let data = require('./data.json');
console.log(data);
console.log(data.name);
