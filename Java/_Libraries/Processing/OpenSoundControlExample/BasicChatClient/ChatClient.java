import oscP5.OscMessage;
import oscP5.OscP5;

import processing.core.PApplet;

public class ChatClient extends PApplet {
    private String typedMessage;
    private OscP5 client;
    private int port;
    private String messages;

    public static void main(String[] args) {
        String[] processingArgs = {"ChatClient"};
        PApplet.main(processingArgs);
    }

    public void settings() {
        size(500, 500);
    }

    public void setup(){
        port = 5204;
        client = new OscP5(this, "localhost", port, OscP5.TCP);
        typedMessage = "";
        messages = "hi there";
    }

    public void draw() {
        background(0);
        fill(255);
        textAlign(LEFT, TOP);
        text(messages, 0, 0);
        textAlign(LEFT, BOTTOM);
        text(typedMessage, 0, height);
    }

    public void keyPressed() {

        if (Character.isAlphabetic(key) || Character.isDigit(key) || key == ' ') {
            typedMessage += key;
        }

        if (keyCode == ENTER) {
            sendMessage(typedMessage);
            typedMessage = "";
        }

    }

    public void oscEvent(OscMessage message) {

        if (message.checkAddrPattern("/server")) {
            String line = message.get(0).stringValue();
            messages = line;
        }

    }

    private void sendMessage(String text) {
        OscMessage message = new OscMessage("/client");
        message.add(text);
        client.send(message);
    }

}
