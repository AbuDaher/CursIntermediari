package TestFinal.ClaseDerivate.Insect;

import TestFinal.ClaseDeBaza.Insect;
import TestFinal.Interfete.IFlyable;

public class Butterfly extends Insect implements IFlyable {

    private double size;

    public Butterfly(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double size) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.size = size;
    }

    @Override
    public void fly() {

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
