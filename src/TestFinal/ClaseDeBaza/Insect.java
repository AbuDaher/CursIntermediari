package TestFinal.ClaseDeBaza;

public class Insect {

    String species;
    String continentOfOrigin;
    String favouriteFood;

    public Insect(String species, String continentOfOrigin, String favouriteFood) {
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
    public String toString() {
        return "Insect{" +
                "species='" + species + '\'' +
                ", continentOfOrigin='" + continentOfOrigin + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
