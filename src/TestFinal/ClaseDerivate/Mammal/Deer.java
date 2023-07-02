package TestFinal.ClaseDerivate.Mammal;

import TestFinal.ClaseDeBaza.Mammal;
import TestFinal.Interfete.IHerbivore;

public class Deer extends Mammal implements IHerbivore {
    private boolean canBeTrained;

    public Deer(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeTrained) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeTrained = canBeTrained;
    }

    @Override
    public void eatOnlyVegetables() {

    }

    public boolean isCanBeTrained() {
        return canBeTrained;
    }

    public void setCanBeTrained(boolean canBeTrained) {
        this.canBeTrained = canBeTrained;
    }


}
