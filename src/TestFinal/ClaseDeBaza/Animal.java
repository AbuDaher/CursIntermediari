package TestFinal.ClaseDeBaza;

import java.util.Scanner;

public abstract class Animal {

    Scanner sc = new Scanner(System.in);

    int yearOfBird;
    String name;
    String gender;

    public Animal(int yearOfBird, String name, String gender) {
        this.yearOfBird = yearOfBird;
        this.name = name;
        this.gender = gender;
    }

    public abstract void eats();

    public void gettingOld(){
        System.out.println("What year is it ?");
        int year = sc.nextInt();
        System.out.println("I'm getting older, now I have " + (year - this.yearOfBird) + "years");;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "yearOfBird=" + yearOfBird +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
