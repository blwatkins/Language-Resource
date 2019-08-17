// HashMap example
// Click to reveal the next element
// Press 'k' to print all the keys
// Press 'v' to print all the values

HashMap <String, PVector> map;
String[] names = {"one", "two", "three", "four"};
int count;

void setup() {
  size(500, 500);
  map = new HashMap<String, PVector>(); // instantiate HashMap
  count = 0;

  for (int i = 0; i < names.length; i++) {
    int x = (int)random(0, width);
    int y = (int)random(0, height);
    PVector p = new PVector(x, y);
    map.put(names[i], p); // add key-value pair to HashMap
  }

  println(map);
}

void draw() {
}

void keyPressed() {
  
  if (key == 'v') {
    println(map.values()); // get all values
  } else if (key == 'k') {
    println(map.keySet()); // get all keys
  }
  
}

void mousePressed() {
  
  if (count < names.length) {
    String name = names[count]; // get current name
    PVector p = map.get(name); // use name to access PVector
    fill(lerpColor(color(0), color(255, 0, 0), (float)count / (names.length - 1)));
    ellipse(p.x, p.y, 25, 25);
    count++;
  }
  
}