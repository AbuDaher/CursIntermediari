package TestFinal.ClaseDeBaza;

public class Mammal {
    String species;
    String ContinentOfOrigin;
    String favouriteFood;

    public Mammal(String species, String continentOfOrigin, String favouriteFood) {
        this.species = species;
        ContinentOfOrigin = continentOfOrigin;
        this.favouriteFood = favouriteFood;
    }

    public void givesBirthToLiveYoungs(){
        System.out.println("All mammals are gining birth to living youngs. ");
    }

    public void eatsLotsOfMeals(int weight){
        if(weight <= 150 && weight >= 80 ) {

            System.out.println(this.species + " must eat 4 meals a day" );
        } else if(weight <= 79 && weight >= 50) {
            System.out.println(this.species + " must eat 3 meals a day" );
        } else if(weight <= 49 && weight >= 5) {
            System.out.println(this.species + " must eat 2 meals a day");
        } else {
            System.out.println("we don't have mammals with this weight");
        }
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "species='" + species + '\'' +
                ", ContinentOfOrigin='" + ContinentOfOrigin + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
