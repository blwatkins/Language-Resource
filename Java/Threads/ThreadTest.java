// Thread Test

public class ThreadTest {

    public static void main(String[] args) {
        ThreadClass t = new ThreadClass("Bob");
        ThreadClass u = new ThreadClass("Bill");
        t.start();
        u.start();
    }

}