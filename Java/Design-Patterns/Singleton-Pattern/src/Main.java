import singleton.ChocolateMixer;

public class Main {

    public static void main(String[] args) {
        ChocolateMixer chocolateMixer = ChocolateMixer.getInstance();
        chocolateMixer.fill();
        chocolateMixer.boil();
        chocolateMixer.drain();
    }
}
