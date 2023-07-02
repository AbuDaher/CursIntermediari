package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;
import TestFinal.Interfete.ICarnivore;

public class Anaconda extends Reptile implements ICarnivore {
    private boolean canBeDangerous;

    public Anaconda(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeDangerous) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeDangerous = canBeDangerous;
    }

    @Override
    public void eatOnlyMeat() {
        System.out.println("Should you be careful around Cobras? The answer is :" + !this.canBeDangerous +
                " This species eat a lot. ");
    }

    public boolean isCanBeDangerous() {
        return canBeDangerous;
    }

    public void setCanBeDangerous(boolean canBeDangerous) {
        this.canBeDangerous = canBeDangerous;
    }
}
