package TestFinal.ClaseDerivate.Bird;

import TestFinal.ClaseDeBaza.Bird;
import TestFinal.Interfete.IFlyable;


public class Crow extends Bird implements IFlyable {
    private double height ;


    public Crow(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood) {
        super(yearOfBird, name, gender, species, continentOfOrigin, favouriteFood);
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
