package TestFinal.ClaseDerivate.Fish;

import TestFinal.ClaseDeBaza.Fish;
import TestFinal.Interfete.ISwimable;

public class BlueTang extends Fish implements ISwimable {

    private double weight;

    public BlueTang(int yearOfBird, String name, String gender, String species, boolean saltWaterFish, int gills, double weight) {
        super(yearOfBird, name, gender, species, saltWaterFish, gills);
        this.weight = weight;
    }

    @Override
    public void canSwim() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
