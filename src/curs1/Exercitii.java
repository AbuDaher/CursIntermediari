package curs1;

import java.lang.reflect.AnnotatedArrayType;

public class Exercitii {
    public static void main(String[] args) {
//        System.out.println("Elena are mere");
//        System.out.println("Elena are mere");
//        System.out.println("Elena are mere");
//
        //Structura metodelor
        //public static (modificatori de acces) <tip returnat> <numemetoda>(<Tip_parametru> <nume_Parametru){
        // }
//        printeazaText();
//        salutaUtilizatorul("Andreea");
//        detaliiDespreUtilizator("Maria", "Gheorghe", "Ticket to ride", 34);
//        for(int i = 1; i<=3; i++){
//            prezinta();
//        }
        prezintaPersoana("Ana", 12); //argumente//reprezinta valoarea pe care o atribuim cand apelam metoda
        prezintaPersoana("Geanina", 29);
        prezintaPersoana("Larisa", 52);
        detaliiPersoana("Livia", 32, "Bucuresti", 2365449324598L);
        calculeazaMedia(3.5, 3.3, 7.23,9.87);
        calculeazaMedia(9.5, 12.3, 0.23,0.87);
        calculeazaMedia(79.5, -12.3, 87.23,235.87);
        lunaCalendaristica("decembrie");
    }

    public static void printeazaText() {
        System.out.println("Elena are mere.");
    }

    public static void salutaUtilizatorul(String numeUtilizator){
        System.out.println("Salut," + numeUtilizator + " !");
    }

    public static void detaliiDespreUtilizator(String numeUtilizator, String numeFamilie, String jocPreferat, int varsta) {
        System.out.println("Salut, " + numeUtilizator + ". Numele tau de familie este " + numeFamilie + ". Jocul tau " +
                "preferat este: " + jocPreferat + " si ai " + varsta + " ani.");

    }
    // Scrieti o metoda fara parametri care se numeste prezinta, si care afiseaza "Salut. Ma numesc Ion si am 30 de ani.
    // Afiseaza metoda de 3 ori in main.
    public static void prezinta() {
        System.out.println("Salut. Ma numesc Ion si am 30 de ani.");

        // Scrie o metoda prezintaPersoana care primeste ca parametri un nume si o varsta si va afisa urmatorul text."
        // Salut ma numesc x si am varsta y ani.

    }
    public static void prezintaPersoana(String nume, int varsta){ // parametri // la declarare//
        System.out.println(" Salut. Numele meu este " + nume + " si am " + varsta + " ani.");
    }
    // Declara o metoda care afiseaza "Ma numesc, X ! Am Y ani, locuiesc in orasul Z iar cnp-ul meu este Q."
    // Foloseste printf

    public static void detaliiPersoana(String nume, int varsta, String oras, long cnp) {
        System.out.printf(" Ma numesc %s, am %d ani, locuiesc in %s iar cnp-ul meu este %d .", nume, varsta, oras, cnp);
    }
    //Scrie o metoda care se numeste calculeazaMedia care primeste ca parametri 4 numere de tip double, si afiseaza
    // media lor sub forma : " Media numerelor este: xx."
    public static void calculeazaMedia(double x, double y, double z, double w){
        double media = (x + y + z + w) / 4;
        System.out.println();
        System.out.printf("Media numerelor este:%f ", media);
        System.out.println();
    }
    //Scrieti o metoda care primeste ca param o luna calendaristica si afiseaza anotimpul corespunzatotr.
    //apleleaza de 4 ori metoda in main cu cate o luna din fiecare anotim.

    public static void lunaCalendaristica(String luna) {
        luna = luna.toLowerCase();
        switch (luna){
            case "decembrie":
                System.out.println("iarna");
                break;
            case "ianuarie":
                System.out.println("iarna");
                break;
            case "februarie":
                System.out.println("iarna");
                break;
            case "martie":
                System.out.println("primavara");
                break;
            case "aprilie":
                System.out.println("primavara");
                break;
            case "mai":
                System.out.println("primavara");
                break;
            case "iunie":
                System.out.println("vara");
                break;
            case "iulie":
                System.out.println("vara");
                break;
            case "august":
                System.out.println("vara");
                break;
            case "septembrie":
                System.out.println("toamna");
                break;
            case "octombrie":
                System.out.println("toamna");
                break;
            case "noiembrie":
                System.out.println("toamna");
                break;
            case "x":
                System.out.println("introdu o luna valida");
                break;


        }
    }
}

