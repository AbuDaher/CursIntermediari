package curs9_abstractizare3;

public class Persoana {
    private String nume;
    private String prenume;
    int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void detaliiPersoane(){
        System.out.println( "Detalii persoana : "+ this.nume + this.prenume + this.varsta);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
