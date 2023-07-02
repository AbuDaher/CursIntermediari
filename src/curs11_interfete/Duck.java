package curs11_interfete;

public class Duck implements IFlyable {
    // o interfata ne da o abilitate
    // ne folosim de interfete atunci cand vrem sa avem mai multe abilitati pe care nu le putem pune in clase
    String name;

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }

    public Duck(String nume){
        this.name = name;

    }

    @Override
    public void fly() {
        System.out.println("Ratusca zboara");
    }
}
