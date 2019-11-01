import processing.net.Server;
import processing.net.Client;

Server server;
String clientMessage;

void setup() {
  size(500, 500);
  server = new Server(this, 5204);
  clientMessage = "";
}

void draw() {
  background(0);
  Client client = server.available();

  if (client != null) {
    clientMessage += client.readStringUntil('\n').trim();
    server.write(clientMessage.toUpperCase() + "\n");
  }

  fill(255);
  textAlign(CENTER, CENTER);
  text(clientMessage, 0, 0, width, height);
}

void keyPressed() {
  server.stop();
}

// a new client has connected
void serverEvent(Server server, Client client) {
  println("New client connected at: " + client.ip());
}
