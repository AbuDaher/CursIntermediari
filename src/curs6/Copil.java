package curs6;

public class Copil {
    String name;
    int age;
    Broasca broasca;
    Copil copil;

    public Copil(String name, int age, Broasca broasca, Copil copil) {
        this.name = name;
        this.age = age;
        this.broasca = broasca;
        this.copil = copil;
    }
    public Copil(String name, int age, Broasca broasca) {
        this.name = name;
        this.age = age;
        this.broasca = broasca;
    }

    public void hranesteAnimalulDeCompanie(){
        System.out.println(this.name + " pune apa la broscuta");
        broasca.beaApa();
        broasca.makenoise();
    }

    @Override
    public String toString() {
        return "Copil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", broasca=" + broasca +
                ", copil=" + copil +
                '}';
    }
}
