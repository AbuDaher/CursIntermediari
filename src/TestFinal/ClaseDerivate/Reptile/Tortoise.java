package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;

public class Tortoise extends Reptile {

    private boolean canBeDangerous;


    public Tortoise(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
    }

    @Override
    public void gettingOld() {
        System.out.println( "This animals leave more that you can calculate. Don't bother.");;
    }

    public boolean isCanBeDangerous() {
        return canBeDangerous;
    }

    public void setCanBeDangerous(boolean canBeDangerous) {
        this.canBeDangerous = canBeDangerous;
    }


}
