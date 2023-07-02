package curs5ClaseSiObiecte;

public class Persoana {
    //Orice obiect trebuie definit prin 2 caracteristici - fields
    // stare - felul cum arata obiectul (variabile)

    String nume;
    int varsta;
    double inaltime;
    double greutate;
    char sex;
    // comportamente - ce poate sa faca obiectul ( nu vor mai fi statice)

    public Persoana(String nume, int varsta, double inaltime, double greutate, char sex){
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.inaltime = inaltime;
        this.sex = sex;
    }

    public void printeazaDetaliiDesprePersoana() {
        System.out.println("Buna ! Ma numesc " + nume + " , am " + varsta + " ani. Am inaltimea " +
                inaltime + " sunt de gen " + sex + ", am greutatea " + greutate);
        if (this.varsta >= 18) {
            if (this.sex == 'F') {
                System.out.println("Sunt majora");

            } else {
                System.out.println("Sunt major");
            }

        }else if (this.sex == 'M') {
                System.out.println("Sunt minor");
            } else {
                System.out.println("Sunt majora");
            }
        }


    public int cresteVarsta() {
        return varsta + 1;

    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", sex=" + sex +
                '}';
    }


}
