package curs11_interfete.aeroport;

import curs11_interfete.IFlyable;

public abstract class Avion implements IFlyable {
    String numeleCompaniei;
    int anulProductiei;
    String marca;

    public Avion(String numeleCompaniei, int anulProductiei, String marca) {
        this.numeleCompaniei = numeleCompaniei;
        this.anulProductiei = anulProductiei;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "numeleCompaniei='" + numeleCompaniei + '\'' +
                ", anulProductiei=" + anulProductiei +
                ", marca='" + marca + '\'' +
                '}';
    }
}
