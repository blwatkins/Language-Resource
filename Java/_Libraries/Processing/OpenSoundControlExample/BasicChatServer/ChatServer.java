import oscP5.OscMessage;
import oscP5.OscP5;
import processing.core.PApplet;

public class ChatServer extends PApplet {
    private String messages;
    private OscP5 server;
    private int port;

    public static void main(String[] args) {
        String[] processingArgs = {"ChatServer"};
        PApplet.main(processingArgs);
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        port = 5204;
        server = new OscP5(this, port, OscP5.TCP);
        messages = "";
    }

    public void draw() {
        background(0);
        textAlign(LEFT, TOP);
        text(messages, 0, 0);
    }

    public void oscEvent(OscMessage message) {

        if (message.checkAddrPattern("/client")) {
            String line = message.get(0).stringValue();
            messages += line + "\n";
            System.out.println(message);
            System.out.println(message.netAddress().port());

            OscMessage response = new OscMessage("/server");
            response.add(messages);
            server.send(response);
            System.out.println("success");
        }

    }

}
