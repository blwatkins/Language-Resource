// 28 October 2017
// Client Socket
// Client recieves welcome message, sends a message to the server, and recieves a response

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    
    public static void main(String[] args)throws Exception {

        try {
            // create client socket
            Socket client = new Socket("localhost", 1254);

            // get welcome message from server
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String welcome = inFromServer.readLine();
            System.out.println(welcome);
        
            // get message from user
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter message: ");
            String message = inFromUser.readLine();

            // send message to server
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            outToServer.writeBytes(message + '\n');

            // get response from server
            String response = inFromServer.readLine();
            System.out.println(">>> " + response);

            // close servers, streams, and buffers
            inFromServer.close();
            inFromUser.close();
            outToServer.close();
            client.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}