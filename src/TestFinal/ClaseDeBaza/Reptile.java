package TestFinal.ClaseDeBaza;

public class Reptile extends Animal{
    String species;
    String continentOfOrigin;
    String favouriteFood;

    public Reptile(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood) {
        super(yearOfBird, name, gender);
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
    public void eats() {

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
