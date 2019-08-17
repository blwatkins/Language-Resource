// 28 October 2017
// Getting user input using a BufferedReader

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInput {

    public static void main(String[] args) {
        
        try{
            // create buffered reader
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
            // get user input
            System.out.print("What is your name? ");
            String name = input.readLine();

            System.out.println("Hello, " + name + "!"); // use input
            input.close(); // close buffer
        } catch (Exception e){
            System.out.println(e);
        }

    }

}