package TestFinal.ClaseDerivate;

public class Vet {

    String name;

    int numberOfVets;
    int numberOfHours;
    int result;

    public Vet(String name, int numberOfVets, int numberOfHours) {
        this.name = name;
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
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", numberOfVets=" + numberOfVets +
                ", numberOfHours=" + numberOfHours +
                '}';
    }
}
