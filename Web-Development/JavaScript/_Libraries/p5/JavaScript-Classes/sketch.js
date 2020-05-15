let circles = [];

function setup() {
    createCanvas(windowWidth, windowHeight);
}

function draw() {
    background(255);

    for (let i = 0; i < circles.length; i++) {
        circles[i].display();
        circles[i].fade();
    }
}

function mousePressed() {
    circles.push(new Circle(mouseX, mouseY));
}
