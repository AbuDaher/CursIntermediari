package TestFinal.ClaseDerivate.Fish;

import TestFinal.ClaseDeBaza.Fish;
import TestFinal.Interfete.IFlyable;

public class Pirahna extends Fish implements IFlyable {

        private double weight;

        public Pirahna(int yearOfBird, String name, String gender, String species, boolean saltWaterFish, int gills, double weight) {
                super(yearOfBird, name, gender, species, saltWaterFish, gills);
                this.weight = weight;
        }

        @Override
        public void fly() {

        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }
}
