import processing.net.Client;

Client client;
String text;

void setup() {
  size(500, 500);
  client = new Client(this, "localhost", 5204);
  text = "";
}

void draw() {
  background(0);
  fill(255);
  textAlign(CENTER, CENTER);
  
  if (text != null) {
    text(text, 0, 0, width, height);
  }
}

void mousePressed() {
 client.write("This is my message\n"); 
}

// message recieved from server
void clientEvent(Client client) {
  String serverMessage = client.readStringUntil('\n');
  text = serverMessage;
}
