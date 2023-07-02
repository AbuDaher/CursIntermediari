package TestFinal.ClaseDerivate.Bird;

import TestFinal.ClaseDeBaza.Bird;

public class Owl extends Bird {
    double height ;

    public Owl(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double height) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.height = height;
    }
}
