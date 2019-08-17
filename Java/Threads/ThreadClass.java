// Thread Class

// Any class that will use threading must inherit from the Thread class
public class ThreadClass extends Thread { 
    public String name;

    public ThreadClass(String name) {
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        
    }
}