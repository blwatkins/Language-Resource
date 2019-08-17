// Brittni Watkins
// Textured Polygon Example
// 18 September 2017
// Draws a polygon with a texture of the image provided
// Flower image accessed via Google Image search: "flowers pattern"

PImage flowers;

void setup() {
  size(500, 500, P2D); 
  flowers = loadImage("flowers.jpg"); 
}

void draw() {
  polygon(width / 2, height / 2, 10, 200, flowers);
}

void polygon(int xPos, int yPos, int sides, float radius, PImage textureImg) {
  float theta = 0;
  strokeWeight(5);
  stroke(0);
  
  if (sides > 2) { 
    beginShape();
    texture(textureImg); 

    for (int i = 0; i < sides; i++) { 
      float x = xPos + (cos(theta) * radius);
      float y = yPos + (sin(theta) * radius);
      float u = (textureImg.width / 2) + (cos(theta) * (textureImg.height / 2));
      float v = (textureImg.height / 2) + (sin(theta) * (textureImg.height / 2));
      
      vertex(x, y, u, v);
      theta += TWO_PI/sides;
    }

    endShape(CLOSE);
  }
  
}