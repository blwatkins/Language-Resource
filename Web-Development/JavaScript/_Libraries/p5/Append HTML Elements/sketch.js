// Template p5.js program

function setup() {
    // create canvas that fills browser window
    createCanvas(windowWidth-20, windowHeight-20);
    appendHTML();
}

function draw() {
    ellipse(mouseX, mouseY, 10, 10);
}

function appendHTML() {
    var myPar = createElement("p", "HTML element appended in code.");
}