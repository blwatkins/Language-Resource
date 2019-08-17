// Arrays

var myNums = []; // create an empty array
var myWords = ["bat", "cat", "hat"]; // create an array with assigned elements

console.log(myNums);
console.log(myWords);

for (var i = 0; i < 10; i++) {
    myNums.push(i * 10); // add an element to the end of an array
}

myWords.unshift("window") // add an element to the beginning of an array

console.log(myNums);
console.log(myWords);

var x = myNums.pop(); // removes and returns last element

var w = myWords.shift(); // removes and returns first element

console.log(myNums);
console.log(myWords);

// printing array with loop

for (var i = 0; i < myNums.length; i++) {
    console.log(myNums[i]);
}

// printing array with foreach function

function printWord(word) {
    console.log(word);
}

myWords.forEach(printWord);
