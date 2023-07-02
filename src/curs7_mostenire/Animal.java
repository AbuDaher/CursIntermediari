package curs7_mostenire;

public class Animal {
    String name;
    String breed;
    int age;
    String color;

    public Animal(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public void eat(){

        System.out.println("mananca bobite");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
