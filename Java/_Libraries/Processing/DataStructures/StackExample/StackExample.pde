// Stack Example
// Press any key to pop an item off the stack and display it on the screen
// Click the mouse to peek at the top of the stack

import java.util.Stack;

Stack<PVector> stack;

void setup() {
  size(500, 500);
  stack = new Stack<PVector>();
  
  for (int i = 0; i < width; i += 10) {
    PVector p = new PVector(i, i);
    stack.push(p); // add an item to the top of the stack
  }
  
  println(stack);
  println("");
}

void draw() {
}

void keyPressed() {
  if (!stack.empty()) {
    PVector p = stack.pop(); // remove the item on the top of the stack
    ellipse(p.x, p.y, 8, 8);
  }
  println(stack);
  println("");
}

void mousePressed() {
  println(stack.peek()); // get the item on the top of the stack, but do not remove it
  println("");
}