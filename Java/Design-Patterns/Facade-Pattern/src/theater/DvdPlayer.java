package theater;

public class DvdPlayer {
    String dvd;

    public DvdPlayer() {
        dvd = "";
    }

    public void on() {
        System.out.println("Turning on DVD Player!");
    }

    public void off() {
        System.out.println("Turning off DVD Player.");
    }

    public void insertDvd(String dvd) {
        this.dvd = dvd;
        System.out.println("Loading DVD: " + dvd + "!");
    }

    public void ejectDvd() {
        this.dvd = "";
        System.out.println("Ejecting DVD.");
    }
}
