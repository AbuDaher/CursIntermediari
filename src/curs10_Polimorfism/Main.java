package curs10_Polimorfism;

public class Main {
    public static void main(String[] args) {
        // permite ca o actiune sa fie realizataa prinma multe feluri
        //polimorfism static
        //polimorfism dinamic
        PersoanaAngajata persoanaangajata = new PersoanaAngajata();
        persoanaangajata.printeazaDetalii();
        System.out.println("----------");
        PersoanaNeangajata persoananeangajata = new PersoanaNeangajata();
        persoananeangajata.printeazaDetalii();
    }
}
