package TestFinal.ClaseDerivate.Fish;

import TestFinal.ClaseDeBaza.Fish;
import TestFinal.Interfete.IFlyable;

public class Tuna extends Fish implements IFlyable {

    private int kg;

    public Tuna(int yearOfBird, String name, String gender, String species, boolean saltWaterFish, int gills) {
        super(yearOfBird, name, gender, species, saltWaterFish, gills);
    }

    @Override
    public void fly() {

    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
