PVector pos;
PVector speed;

void setup() {
  size(500, 500);
  pos = new PVector();
  speed = new PVector();

  pos.x = random(0, width);
  pos.y = random(0, height);

  speed.x = random(-5, 5);
  speed.y = random(-5, 5);
}

void draw() {
  displayBall();
  moveBall();
  checkCollision();
}

void displayBall() {
  ellipse(pos.x, pos.y, 25, 25);
}

void moveBall() {
  pos.add(speed);
}

void checkCollision() {
 if (pos.x > width || pos.x < 0) {
  speed.x *= -1; 
 }
 
 if (pos.y > height || pos.y < 0) {
  speed.y *= -1; 
 }
 
 pos.x = constrain(pos.x, 0, width);
 pos.y = constrain(pos.y, 0, height);
}
