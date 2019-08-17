// An Example of the Minim library
// Sound File -> "Momentary" from Dissonants by Hands Like Houses
// Larger circle whose color changes according to song position
// Smaller circles show starting and ending color 
// Press any key to pause the song
// Click the mouse to play the song

// Be sure to install the Minim library
// Sketch -> Import Library -> Add Library -> Search "Minim" -> Install
// Sketch -> Import Library -> Minim

import ddf.minim.*;

Minim minim;
AudioPlayer player;

float total;
float current;
float ratio;

void setup() {
  size(500, 500);
  minim = new Minim(this); // instantiate Minim
  player = minim.loadFile("08_Momentary.mp3"); // load sound file
  player.play(); // play sound file
  
  // calculate play ratio
  total = player.length();
  current = 0;
  ratio = current / total;
}

void draw() {
  noStroke();
  
  // music circle
  fill(lerpColor(color(0, 0, 255), color(200, 0, 200), ratio));
  ellipse(width / 2, height / 2, width, height);
  
  // start color circle
  fill(0, 0, 255);
  ellipse(width / 10, height / 2, width / 5, height / 5);
  
  // end color circle
  fill(255, 0, 255);
  ellipse(width - width / 10, height / 2, width / 5, height / 5);
  
  // calculate current ratio
  current = player.position();
  ratio = current / total; 
}

void keyPressed() {
  player.pause();
  print(player.position()); // get current position of the song in milliseconds
}

void mousePressed() {
 player.play(); 
}