package TestFinal.ClaseDerivate.Fish;

import TestFinal.ClaseDeBaza.Fish;

public class Pirahna extends Fish {

        double weight;

        public Pirahna(int yearOfBird, String name, String gender, String species, boolean saltWaterFish, int gills, double weight) {
                super(yearOfBird, name, gender, species, saltWaterFish, gills);
                this.weight = weight;
        }
}
