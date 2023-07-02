package curs7_mostenire;

public class Catel extends Animal {


    public Catel(String name, String breed, int age, String color) {
        super(name, breed, age, color);
    }

    public void bark(){
        System.out.println( "latra: \"Ham, Ham\"");
    }
}
