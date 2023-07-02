package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;
import TestFinal.Interfete.IPoisonous;

public class Cobra extends Reptile implements IPoisonous {
    private boolean canBeDangerous;

    public Cobra(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeDangerous) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeDangerous = canBeDangerous;
    }

    @Override
    public void canPoisonYou() {
        System.out.println("Should you be careful around Cobras? The answer is :" + !this.canBeDangerous);
    }

    public boolean isCanBeDangerous() {
        return canBeDangerous;
    }

    public void setCanBeDangerous(boolean canBeDangerous) {
        this.canBeDangerous = canBeDangerous;
    }


}
