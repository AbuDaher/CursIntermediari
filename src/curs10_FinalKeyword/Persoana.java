package curs10_FinalKeyword;

public class Persoana {
    private String nume;
   private int varsta;
   private final String CNP;

    public Persoana(String nume, int varsta, String CNP) {
        this.nume = nume;
        this.varsta = varsta;
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", CNP='" + CNP + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCNP() {
        return CNP;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
