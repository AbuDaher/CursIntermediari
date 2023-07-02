package TestFinal.ClaseDeBaza;

public class Fish {
    String species;
    boolean saltWaterFish;
    int gills;

    public Fish(String species, boolean saltWaterFish, int gills) {
        this.species = species;
        this.saltWaterFish = saltWaterFish;
        this.gills = gills;
    }

    public void swims(){
        if (saltWaterFish){
            System.out.println(this.species + " swims in salty waters.");
        } else {
            System.out.println(this.species +  " swims in fresh waters ");
        }
    }

    public void breathesUnderwater(int minutes){
        System.out.println(this.species + " can beathe underwater for " + minutes + " minutes. ");

    }

    @Override
    public String toString() {
        return "Fish{" +
                "species='" + species + '\'' +
                ", saltWaterFish=" + saltWaterFish +
                ", gills=" + gills +
                '}';
    }
}
