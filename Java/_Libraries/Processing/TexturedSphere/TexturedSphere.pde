// Apply a texture to a rotating sphere

PImage world;
PShape sphere;
float theta;

void setup() {
  size(500, 500, P3D);
  theta = 0;
  world = loadImage("map.jpeg");
  sphere = createShape(SPHERE, 100);
}

void draw() {
  pushMatrix();
  translate(width / 2, height / 2);
  rotateY(theta);
  sphere.setStroke(false);
  sphere.setTexture(world);
  shape(sphere);
  popMatrix();
  theta += 0.01;
}
