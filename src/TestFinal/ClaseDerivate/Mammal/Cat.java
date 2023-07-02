package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;

public class Cat extends Mammal {
    private boolean canBeTrained;

    public Cat(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeTrained) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeTrained = canBeTrained;
    }

    @Override
    public void eatsLotsOfMeals(int weight) {
        System.out.println("Cats eat as many meals as they want. ");
    }

    public boolean isCanBeTrained() {
        return canBeTrained;
    }

    public void setCanBeTrained(boolean canBeTrained) {
        this.canBeTrained = canBeTrained;
    }


}
