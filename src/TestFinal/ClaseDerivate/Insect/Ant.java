package TestFinal.ClaseDerivate.Insect;

import TestFinal.ClaseDeBaza.Insect;

public class Ant extends Insect {

    double size;

    public Ant(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double size) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.size = size;
    }
}
