package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;
import TestFinal.Interfete.ICarnivore;

public class Lion extends Mammal implements ICarnivore {
    public boolean canBeTrained;

    public Lion(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeTrained) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeTrained = canBeTrained;
    }

    @Override
    public void eatOnlyMeat() {

    }

    public boolean isCanBeTrained() {
        return canBeTrained;
    }

    public void setCanBeTrained(boolean canBeTrained) {
        this.canBeTrained = canBeTrained;
    }


}
