package org.learning.animali;

public class Main {
    public static void main(String[] args) {
        Animal[] animali={new Passerotto(),new Dog(),new Delfino(),new Aquila()};
        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia("mais");
        passerotto.dormi();

        Dog dog = new Dog();
        dog.verso();
        dog.mangia("Croccantini");
        dog.dormi();

        Main.check(animali);



    }

    public static void check(Animal[] animale){
        for (int i = 0; i < animale.length; i++) {
            if (animale[i] instanceof Fly){
                faiVolare((Fly)animale[i]);
            } else if (animale[i] instanceof Swim) {
                faiNuotare((Swim)animale[i]);
            }
        }

    }

    public static void faiVolare(Fly fly){
        fly.vola();
    }

    public static void faiNuotare(Swim swim){
        swim.nuota();
    }
}
