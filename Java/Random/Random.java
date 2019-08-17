// Generating random numbers
// Math.random() returns a double between 0 and 1

public class Random {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            double num = Math.random();
            System.out.println(i + ": " + num);
        }

        System.out.println("");

        int maxNumber = 100;

        for (int i = 0; i < 10; i++) {
            float num = (float)Math.random();
            num *= maxNumber;
            System.out.println(i + ": " + num);
        }

    }

}