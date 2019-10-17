// 25 Oct 2017
// A program that counts and prints out the arguments passed into the program at execution

public class CommandLineArguments {

    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command line arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}