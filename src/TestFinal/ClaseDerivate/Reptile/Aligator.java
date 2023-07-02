package TestFinal.ClaseDerivate.Reptile;

import TestFinal.ClaseDeBaza.Reptile;
import TestFinal.Interfete.ICarnivore;
import TestFinal.Interfete.ISwimable;

public class Aligator extends Reptile implements ICarnivore, ISwimable {

    private boolean canBeDangerous;


    public Aligator(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, boolean canBeDangerous) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.canBeDangerous = canBeDangerous;
    }

    @Override
    public void eatOnlyMeat() {
        System.out.println("Aligators eat only meat");

    }

    @Override
    public void canSwim() {
        System.out.println("Should you be careful around Aligator? The answer is : + !this.canBeDangerous ");
    }

    public boolean isCanBeDangerous() {
        return canBeDangerous;
    }

    public void setCanBeDangerous(boolean canBeDangerous) {
        this.canBeDangerous = canBeDangerous;
    }


}
