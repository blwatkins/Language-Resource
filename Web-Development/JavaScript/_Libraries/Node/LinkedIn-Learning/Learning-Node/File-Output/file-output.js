let fs = require('fs');

let data = {
	name: 'Bob'
};

function printError(error) {
	
	if (error) {
		console.log(error);
	}
}

let string = JSON.stringify(data);

fs.writeFile('data.json', string, 'utf-8', printError);
