package curs7_mostenire;

public class Main {
    public static void main(String[] args) {
        Catel catel = new Catel("Azor","Chow chow",3, "white");
        catel.bark();
        catel.eat();
//        System.out.println("Catelul " + catel.name + " are " + catel.age + " ani, rasa " + catel.breed + " si culoarea "
//        + catel.color);
        System.out.println(catel);

        Pisica pisica = new Pisica("Lucky","British",5,"black", 7);
        pisica.decreaseNumberOfLives();
        pisica.eat();
        System.out.println("Pisica pe nume " + pisica.name + " are culoarea "
                + pisica.color);
        pisica.decreaseNumberOfLives();
//        System.out.println("Pisica pe nume " + pisica.name + " are culoarea "
//                + pisica.color);
        System.out.println(pisica);

        Hamster hamster = new Hamster("Yoda", "Don't know", 1, "brown");

        hamster.eat();
//        System.out.println("Hamsterul pe nume " + hamster.name + " are culoarea "
//                + hamster.color);
        System.out.println(hamster);
    }
}
