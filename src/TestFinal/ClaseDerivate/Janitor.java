package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Janitor extends Employee {
   private double numberOfHoursWorkers;
   private final int gardenArea = 10000;

    public Janitor(String name, String jobName, int age, double numberOfHoursWorkers) {
        super(name, jobName, age);
        this.numberOfHoursWorkers = numberOfHoursWorkers;
    }

    public String workingGuardien(){
        double result = gardenArea / numberOfHoursWorkers;
        return "Today, each janitor had to clean " + result + " sourface. ";
    }

    @Override
    public void feedsAnimals() {

    }

    @Override
    public String toString() {
        return "Janitor{" +
                "numberOfHoursWorkers=" + numberOfHoursWorkers +
                ", gardenArea=" + gardenArea +
                '}';
    }

    public double getNumberOfHoursWorkers() {
        return numberOfHoursWorkers;
    }

    public void setNumberOfHoursWorkers(double numberOfHoursWorkers) {
        this.numberOfHoursWorkers = numberOfHoursWorkers;
    }

    public int getGardenArea() {
        return gardenArea;
    }
}
