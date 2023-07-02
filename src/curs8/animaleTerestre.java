package curs8;

public class animaleTerestre extends Animal {

    boolean respira;

    public animaleTerestre(String nume, int varsta, String culoare, boolean respira) {
        super(nume, varsta, culoare);
        this.respira = respira;


    }

    @Override
    public String toString() {
        return "animaleTerestre{" +
                "respira=" + respira +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
