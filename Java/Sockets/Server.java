// 28 October 2017
// Server Socket
// Server sends welcome message, recieves a message from the client, then sends a response

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) throws Exception{

        try {
            // create server socket
            ServerSocket server = new ServerSocket(1254);

            // create client socket
            Socket client = server.accept();

            // send welcome message to client
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            outToClient.writeBytes("Welcome! This server converts all messages to upper case." + '\n');
            System.out.println("Message Sent");

            // get message from client
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String message = inFromClient.readLine();
            System.out.println("Message Recieved => " + message);

            // create response
            String response = message.toUpperCase() + '\n';

            // send response to client
            outToClient.writeBytes(response);

            // close servers, streams, and buffers
            outToClient.close();
            inFromClient.close();
            client.close();
            server.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}