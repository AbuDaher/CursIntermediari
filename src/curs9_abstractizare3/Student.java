package curs9_abstractizare3;

public class Student extends Persoana {
    private String numeFacultate;
    private int numarMatricol;

    public Student(String nume, String prenume, int varsta, String numeFacultate, int numarMatricol) {
        super(nume, prenume, varsta);
        this.numeFacultate = numeFacultate;
        this.numarMatricol = numarMatricol;
    }

    public String getNumeFacultate() {
        return numeFacultate;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numeFacultate='" + numeFacultate + '\'' +
                ", numarMatricol=" + numarMatricol +
                '}';
    }
}
