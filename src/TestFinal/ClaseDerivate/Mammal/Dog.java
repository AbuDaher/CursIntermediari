package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;

public class Dog extends Mammal {
    private boolean canBeTrained;

    public Dog(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeTrained) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeTrained = canBeTrained;
    }

    @Override
    public void givesBirthToLiveYoungs() {
        System.out.println("Puppies will melt your heart");
    }

    public void setCanBeTrained(boolean canBeTrained) {
        this.canBeTrained = canBeTrained;
    }
}
