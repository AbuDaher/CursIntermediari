package curs10_Polimorfism;
// super. vine cu implementarea din clasa parinte. daca vrem sa suprascriem stergem si inlocuim cu noua functionalitate
public class PersoanaAngajata extends Persoana{
    @Override
    public void printeazaDetalii() {
        System.out.println("Angajat");
    }
}
