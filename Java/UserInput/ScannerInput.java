// 28 October 2017
// Getting user input using a Scanner

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        // create buffered reader
        Scanner input = new Scanner(System.in);
        
        // get user string input
        System.out.print("What is your name? ");
        String name = input.next();

        // get integer input
        System.out.print("What is your age? ");
        int age = input.nextInt();

        // get floating point input
        System.out.print("How much do you weigh(lbs)? ");
        float weight = input.nextFloat();

        // use input
        System.out.println("Your name is " + name + ". " +
            "You are " + age + " years old, and you weigh " +
            weight + " pounds. ");

        input.close(); // close buffer
    }

}