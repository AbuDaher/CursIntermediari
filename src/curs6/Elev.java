package curs6;

public class Elev {
    String nume;
    int varsta;
    static String scoala;

    public Elev(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void printeazaDetalii(){
        System.out.println("Elevul " + this.nume + " are varsta " + this.varsta + " este elev la scoala " + scoala);
    }

    public static void schimbaScoala(String scoalaNoua){
        scoala = scoalaNoua;

    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", scoala=" + scoala +
                '}';
    }
}
