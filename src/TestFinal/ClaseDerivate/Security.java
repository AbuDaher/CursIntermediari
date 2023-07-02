package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Security extends Employee {

   private double numberOfGuardien;
   private boolean hasSpecialEquipment;
   private final int gardenArea = 10000;

    public Security(String name, String jobName, int age, double numberOfGuardien, boolean hasSpecialEquipment) {
        super(name, jobName, age);
        this.numberOfGuardien = numberOfGuardien;
        this.hasSpecialEquipment = hasSpecialEquipment;
    }

    public String workingGuardien(){
        double result = gardenArea / numberOfGuardien;
        return "Today, each guardian had to secure " + result + " sourface. ";
    }

    @Override
    public void feedsAnimals() {

    }

    @Override
    public String toString() {
        return "Security{" +
                "numberOfGuardien=" + numberOfGuardien +
                ", hasSpecialEquipment=" + hasSpecialEquipment +
                '}';
    }

    public double getNumberOfGuardien() {
        return numberOfGuardien;
    }

    public void setNumberOfGuardien(double numberOfGuardien) {
        this.numberOfGuardien = numberOfGuardien;
    }

    public boolean isHasSpecialEquipment() {
        return hasSpecialEquipment;
    }

    public void setHasSpecialEquipment(boolean hasSpecialEquipment) {
        this.hasSpecialEquipment = hasSpecialEquipment;
    }

    public int getGardenArea() {
        return gardenArea;
    }
}
