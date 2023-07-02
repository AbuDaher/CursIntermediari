package TestFinal.ClaseDerivate.Fish;

import TestFinal.ClaseDeBaza.Fish;

public class Somon extends Fish {
    double weight;

    public Somon(int yearOfBird, String name, String gender, String species, boolean saltWaterFish, int gills, double weight) {
        super(yearOfBird, name, gender, species, saltWaterFish, gills);
        this.weight = weight;
    }
}
