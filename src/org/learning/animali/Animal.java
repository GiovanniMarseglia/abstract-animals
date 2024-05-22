package org.learning.animali;

public abstract class Animal {
    void dormi(){
        System.out.println("Zzz");
    }


    abstract void verso();

    abstract void mangia(String food);

}
