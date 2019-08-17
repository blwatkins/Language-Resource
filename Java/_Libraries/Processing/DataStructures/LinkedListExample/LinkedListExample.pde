// Linked List Example
// Click to add a random element
// Press any key to print the list
// Press 'r' to remove an element from the list

import java.util.LinkedList;

LinkedList<PVector> list;

void setup () {
  size(500, 500);
  list = new LinkedList<PVector>(); // instantiate list
}

void draw() {
  background(0);
  
  for (int i = 0; i < list.size(); i++) {
    PVector p = list.get(i); // access element at index i
    ellipse(p.x, p.y, 20, 20);
  }
  
}

void mousePressed() {
  int x = (int)random(0, width);
  int y = (int)random(0, height);
  PVector p = new PVector(x, y);
  list.add(p); // add an element to the end of the list
}

void keyPressed() {
  
  for (PVector p : list) {
    println(p);
  }
  
  if (key == 'r' && list.size() > 0) {
    int r = (int)random(0, list.size());
    list.remove(r); // remove an element from the list
    // list.remove() // removes first element from the list // queue behavior 
  }
  
  println(list);
}