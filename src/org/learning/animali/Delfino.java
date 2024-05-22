package org.learning.animali;

public class Delfino extends Animal implements Swim{
    @Override
    void verso() {
        System.out.println("bbbbb");
    }

    @Override
    void mangia(String food) {
        System.out.println("Mangio prevalentemente " + food);
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
