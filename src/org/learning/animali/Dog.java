package org.learning.animali;

public class Dog extends Animal implements Swim{

    @Override
    void verso() {
        System.out.println("Bau bau");
    }

    @Override
    void mangia(String food) {
        System.out.println("Mangio principalmente " + food);
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
