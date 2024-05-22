package org.learning.animali;

public class Aquila extends Animal implements Fly{
    @Override
    void verso() {
        System.out.println("Aaaa");
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
