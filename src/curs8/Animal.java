package curs8;

public class Animal {
    String nume;
    int varsta;
    String culoare;

    public Animal(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
    }

    public void mananca(){
        System.out.println("Animalul a mancat");
    }

    //afisare stare interna a obiectului

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
