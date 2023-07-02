package TestFinal.ClaseDerivate.Insect;

import TestFinal.ClaseDeBaza.Insect;

public class Cricket extends Insect {

    double size;

    public Cricket(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double size) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.size = size;
    }
}
