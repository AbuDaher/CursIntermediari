package TestFinal.ClaseDeBaza;

public class Insect extends Animal{

    String species;
    String continentOfOrigin;
    String favouriteFood;

    public Insect(int yearOfBird, String name, String gender, String species, String continentOfOrigin, String favouriteFood) {
        super(yearOfBird, name, gender);
        this.species = species;
        this.continentOfOrigin = continentOfOrigin;
        this.favouriteFood = favouriteFood;
    }

    public void canFly(String distace){
        System.out.println(" The bird that originates from the continent " + this.continentOfOrigin +
                " can fly " + distace +"miles");
    }

    public void pinches(){
        System.out.println(this.species + "originates from " + this.continentOfOrigin +
                " can pich you if you disturb their environment");
    }

    @Override
    public void eats() {

    }

    @Override
    public String toString() {
        return "Insect{" +
                "species='" + species + '\'' +
                ", continentOfOrigin='" + continentOfOrigin + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
