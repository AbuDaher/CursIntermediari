package TestFinal.ClaseDerivate.Bird;

import TestFinal.ClaseDeBaza.Bird;
import TestFinal.Interfete.IFlyable;

public class Pelican extends Bird implements IFlyable {
    private double height ;

    public Pelican(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood, double height) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
        this.height = height;
    }

    @Override
    public void fly() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
