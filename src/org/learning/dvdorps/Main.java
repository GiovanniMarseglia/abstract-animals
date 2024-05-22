package org.learning.dvdorps;

public class Main {
    public static void main(String[] args) {
    Creator creator = new Creator();
    Object[] instanza = new Object[2];
    instanza[0] = creator.create("playstation");
    instanza[1] = creator.create("dvd");

    if(instanza[0] instanceof Playstation){
        ((Playstation)instanza[0]).play();
        ((Playstation)instanza[0]).stop();
    }
    if (instanza[1] instanceof Dvd) {
        ((Dvd)instanza[1]).play();
        ((Dvd)instanza[1]).stop();
    }
    }
}
