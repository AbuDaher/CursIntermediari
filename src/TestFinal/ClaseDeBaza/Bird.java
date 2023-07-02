package TestFinal.ClaseDeBaza;

public class Bird extends Animal{
    String species;
    String continentOfOrigin;
    String favouriteFood;


    public Bird(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood) {
        super(yearOfBird, name, gender);
        this.species = species;
        this.continentOfOrigin = continentOfOrigin;
        this.favouriteFood = favouriteFood;
    }

    public void sings(){

        System.out.println("The " + this.species + " can sing in the morning");
    }

    public void canFly(String distace){
        System.out.println(" The bird that originates from the continent " + this.continentOfOrigin +
                " can fly " + distace +"miles");
    }

    @Override
    public void eats() {

    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", continentOfOrigin='" + continentOfOrigin + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
