package curs9_abstractizare;

public class Roman extends Om {
    @Override
    public void saluta() {
        System.out.println(this.nume + " A spus 'Salut'");
    }

    @Override
    public void mananca() {
        System.out.println("Introdu felul de mancare(in romana)");
        String felDeMancare = sc.nextLine();
        System.out.println(this.nume + " a mancat " + felDeMancare);
    }

    public Roman(String nume, String prenume) {
        super(nume, prenume);


    }
}
