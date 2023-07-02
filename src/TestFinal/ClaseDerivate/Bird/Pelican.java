package TestFinal.ClaseDerivate.Bird;

import TestFinal.ClaseDeBaza.Bird;

public class Pelican extends Bird {
    double height ;

    public Pelican(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double height) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.height = height;
    }
}
