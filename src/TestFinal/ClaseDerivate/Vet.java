package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Vet extends Employee {

    String name;

    private int numberOfVets;
    private int numberOfHours;
    private int result;

    public Vet(String name, String jobName, int age, int numberOfVets, int numberOfHours) {
        super(name, jobName, age);

        this.numberOfVets = numberOfVets;
        this.numberOfHours = numberOfHours;
    }

    public String takesCareOfAnimals(){
        result = numberOfHours * numberOfVets;
        return this.name + " takes care of " + result + " animals per day ";

    }

    public String collectsMoney(int amount){
        result = amount * numberOfVets * numberOfHours;
        return this.name + " makes " + result + " profit per day";
    }

    @Override
    public void feedsAnimals() {

    }

    @Override
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", numberOfVets=" + numberOfVets +
                ", numberOfHours=" + numberOfHours +
                ", result=" + result +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVets() {
        return numberOfVets;
    }

    public void setNumberOfVets(int numberOfVets) {
        this.numberOfVets = numberOfVets;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
