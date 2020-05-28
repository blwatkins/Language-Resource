package facade;

import theater.*;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Light light;
    private PopcornMachine popcornMachine;
    private Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Light light, PopcornMachine popcornMachine, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.popcornMachine = popcornMachine;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        popcornMachine.on();
        popcornMachine.pop();
        light.off();
        screen.down();
        dvdPlayer.on();
        dvdPlayer.insertDvd(movie);
        dvdPlayer.play();
    }

    public void endMovie() {
        popcornMachine.off();
        light.on();
        screen.up();
        dvdPlayer.ejectDvd();
        dvdPlayer.off();
    }
}
