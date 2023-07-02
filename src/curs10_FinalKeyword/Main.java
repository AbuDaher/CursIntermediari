package curs10_FinalKeyword;

public class Main {
    public static void main(String[] args) {
        // Final
        // valoarea unui camp nu poate fi schimbata (dupa initializare) - ramane o constanta
        // conventie : constantele se scriu cu litera mare
        Persoana persoana = new Persoana("Ana", 34, "233469876543");
        System.out.println(persoana.getCNP());
        System.out.println(persoana);

        ContBancarPersoana cont = new ContBancarPersoana("Ana", "Maria","2345876543");
        System.out.println(cont.getCNP());
        cont.setNume("Popescu");
        cont.detaliiClient();

        // afiseaza numele bancii
        ContBancarPersoana.getNumeBanca();
        System.out.println(ContBancarPersoana.getNumeBanca());

    }
}
