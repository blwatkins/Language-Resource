// Timing functions using nanoTime

public class Timing {

    public static void main(String[] args) {
        long start = System.nanoTime();
        foo();
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("The function took " + time + " nanoseconds");
    }
    
    public static void foo() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }

}