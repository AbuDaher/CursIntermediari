package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Security extends Employee {

    double numberOfGuardien;
    boolean hasSpecialEquipment;
    final int gardenArea = 10000;

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
}
