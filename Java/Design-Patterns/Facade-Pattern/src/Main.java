import facade.HomeTheaterFacade;
import theater.*;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new DvdPlayer(), new Light(), new PopcornMachine(), new Screen());
        homeTheaterFacade.watchMovie("How to Lose a Guy in 10 Days");
        homeTheaterFacade.endMovie();
    }
}
