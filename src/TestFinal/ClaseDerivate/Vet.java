package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Vet extends Employee {

    String name;

    private int numberOfVets;
    private int numberOfHours;
    private int result;

    public Vet(String name, String jobName, int age, String name1, int numberOfVets, int numberOfHours, int result) {
        super(name, jobName, age);
        this.name = name1;
        this.numberOfVets = numberOfVets;
        this.numberOfHours = numberOfHours;
        this.result = result;
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
