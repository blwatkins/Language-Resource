// Testing URLs

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLTest {

    public static void main(String[] args) {
        String url = "https://s2.smu.edu/~blwatkins/CSE_3342/Assignment_10/dataService.php";
        System.out.println(url);
        printPage(url);
    }

    public static void printPage(String url) {
        try {
            URL request = new URL(url);

            try {
                InputStreamReader input = new InputStreamReader(request.openStream(), "UTF-8");
                BufferedReader reader = new BufferedReader(input);
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}