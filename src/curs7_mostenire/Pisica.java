package curs7_mostenire;

public class Pisica extends Animal{

    int numberOfLives;

    public Pisica(String name, String breed, int age, String color, int numberOfLives) {
        super(name, breed, age, color);
        this.numberOfLives = numberOfLives;
    }

    public void decreaseNumberOfLives(){
        System.out.println("Oups! Pisica a cazut de la balcon , iar acum mai are " + --this.numberOfLives + " vieti ");
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "numberOfLives=" + numberOfLives +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
