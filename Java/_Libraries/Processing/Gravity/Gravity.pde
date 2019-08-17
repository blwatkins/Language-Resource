// Gravity Example
// A moving circle with gravity, damping, and friction

float x;
float y; 
float yS;
float xS;
float g;
float damping;
float friction;

void setup() {
  size(500, 500);
  x = width / 2;
  y = height / 5;
  yS = random(-5, 5);
  xS = random(-5, 5);
  g = random(0.8, 1);
  damping = random(0.7, 0.95);
  friction = random(0.7, 0.95);
}

void draw() {
  background(200);
  displayStatistics();
  displayCircle();
  moveCircle();
}

void displayStatistics() {
  fill(0);
  textAlign(LEFT, TOP);
  text("Gravity: " + g, 0, 0);
  text("Damping: " + damping, 0, 20);
  text("Friction: " + friction, 0, 40);
}

void displayCircle() {
  fill(255);
  ellipse(x, y, 50, 50);
}

void moveCircle() {
  x += xS; // move in the x-direction; positive xS -> right, negative xS -> left
  y = y + yS; // move in the y-direction; positive yS -> down, negative yS -> up
  yS = yS + g; // account for acceleration from gravity

  // has the circle hit the left or right edge of the screen?
  if (x <= 0) { // left edge
    x = 0; // prevent oscilation bug
    xS *= -friction; // reverse speed, accounting for loss of energy from friction
  } else if (x >= width) { // right edge
    x = width; // prevent oscilation bug
    xS *= -friction; // reverse speed, accounting for loss of energy from friction
  }

  // has the circle hit the top or bottom of the screen?
  if (y <= 0) { // top
    y = 0; // prevent oscilation bug
    yS *= -damping; // reverse speed, accounting for loss of energy from damping
  } else if (y >= height) { // bottom
    y = height; // prevent oscilation bug
    yS *= -damping; // reverse speed, accounting for loss of energy from damping
  }
}