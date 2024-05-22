package org.learning.animali;

public class Passerotto extends Animal implements Fly{
    @Override
    void verso() {
        System.out.println("Cip cip");
    }

    @Override
    void mangia(String food) {
        System.out.println("Mangio prevalentemente " + food);
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
