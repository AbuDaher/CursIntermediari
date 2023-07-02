package curs9_abstractizare;

public class Francez extends Om{
    @Override
    public void saluta() {
        System.out.println(this.nume  + " a spus 'Bonjour'");
    }

    @Override
    public void mananca() {
        System.out.println("Introdu felul de mancare (in franceza)");
        String felDeMancare = sc.nextLine();
        System.out.println(this.nume + " a mancat " + felDeMancare);
    }

    public Francez(String nume, String prenume) {
        super(nume, prenume);


    }
}
