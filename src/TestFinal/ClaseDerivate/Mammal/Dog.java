package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;

public class Dog extends Mammal {
    boolean canBeTrained;

    public Dog(String species, String continentOfOrigin, String favouriteFood) {
        super(species, continentOfOrigin, favouriteFood);
    }
}
