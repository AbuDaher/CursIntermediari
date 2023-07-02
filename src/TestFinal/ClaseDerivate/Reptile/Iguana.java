package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;

public class Iguana extends Reptile {
    private boolean canBeDangerous;

    public Iguana(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeDangerous) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeDangerous = canBeDangerous;
    }

    @Override
    public void coldBlood() {

        System.out.println("This species need special light to get worm.");
    }

    public boolean isCanBeDangerous() {
        return canBeDangerous;
    }

    public void setCanBeDangerous(boolean canBeDangerous) {
        this.canBeDangerous = canBeDangerous;
    }


}
