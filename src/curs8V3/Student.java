package curs8V3;

public class Student {
    private int varsta;
    private int inaltime;
    private int greutate;
    private String nume;

    public Student(int varsta, int inaltime, int greutate, String nume) {
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "varsta=" + varsta +
                ", inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", nume='" + nume + '\'' +
                '}';
    }

    public int getVarsta() {
        return varsta;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getNume() {
        return nume;
    }

    public void setVarsta(int varsta) {
        if (varsta < 50 && varsta > 19) {
            this.varsta = varsta;
        } else {
            System.out.println("Varsta nu este valida");
        }
    }


    public void setNume(String nume) {
        if (nume.length() >= 3) {
            this.nume = nume;
        } else {
            System.out.println("Numele nu poate avea mai putin de 2 caractere");
        }
    }
}