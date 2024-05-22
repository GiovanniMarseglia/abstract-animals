package org.learning.dvdorps;

public class Dvd implements Hardware{

    @Override
    public void play() {
        System.out.println("Sono un lettore DVD e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettore DVD e sono in modalità stop");
    }
}
