// 25 October 2017
// Reading in a file and printing each line to the console

import java.io.BufferedReader;
import java.io.FileReader;

public class FileInput_BufferedReader {

    public static void main(String[] args) {
        String fileName = "hope.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";

            while(br.ready()) {
                line = br.readLine();
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
