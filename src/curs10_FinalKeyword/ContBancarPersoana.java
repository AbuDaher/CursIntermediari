package curs10_FinalKeyword;

public class ContBancarPersoana {
   private String nume;
   private String prenume;
   private final String CNP;
   private static final String numeBanca = "Banca Transilvania"; // apartine clasei , nu il introducem in constructor ,
                                                    // in constuctor punem fildurile care apartin obiectelor


    public ContBancarPersoana(String nume, String prenume, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public static String getNumeBanca() {
        return numeBanca;
    }


    public static void detaliiBanca(String numeBanca){
        System.out.println("Bun venit la banca " + numeBanca ); // this face parte din structura interna a obiectului,
                                                            // campurile care aprtin doar clasei nu pot fi accesate cu this.
    }
    public void detaliiClient(){
        System.out.println("Persoana " + this.nume + this.prenume + " cu CNP-ul " + this.CNP + " are cont la " + numeBanca);
    }
}
