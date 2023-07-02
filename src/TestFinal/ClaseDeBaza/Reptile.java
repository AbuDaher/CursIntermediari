package TestFinal.ClaseDeBaza;

public class Reptile {
    String species;
    String continentOfOrigin;
    String favouriteFood;

    public Reptile(String species, String continentOfOrigin, String favouriteFood) {
        this.species = species;
        this.continentOfOrigin = continentOfOrigin;
        this.favouriteFood = favouriteFood;
    }

    public void coldBlood(){
        System.out.println(this.species + " originates from " + this.continentOfOrigin +" has cold blood");
    }

    public void eatsmeat(){
        System.out.println(this.species + "  diet is composed of mainly meat");
    }



    @Override
    public String toString() {
        return "Reptile{" +
                "species='" + species + '\'' +
                ", ContinentOfOrigin='" + continentOfOrigin + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
