package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Vet extends Employee {

    String name;

    int numberOfVets;
    int numberOfHours;
    int result;

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
}
