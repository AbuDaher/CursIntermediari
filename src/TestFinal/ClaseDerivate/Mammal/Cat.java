package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;

public class Cat extends Mammal {
    boolean canBeTrained;

    public Cat(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeTrained) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeTrained = canBeTrained;
    }
}
