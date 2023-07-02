package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;

public class Anaconda extends Reptile {
    boolean canBeDangerous;

    public Anaconda(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeDangerous) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeDangerous = canBeDangerous;
    }
}
