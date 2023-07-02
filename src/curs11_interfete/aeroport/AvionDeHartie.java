package curs11_interfete.aeroport;

public class AvionDeHartie extends Avion {

    public AvionDeHartie(String numeleCompaniei, int anulProductiei, String marca) {
        super(numeleCompaniei, anulProductiei, marca);
    }

    @Override
    public void fly() {
        System.out.println("Avionul de hartie s-a ridicat de la sol");
    }
}
