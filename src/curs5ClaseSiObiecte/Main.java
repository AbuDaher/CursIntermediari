package curs5ClaseSiObiecte;

import java.util.Scanner;

// clasa de baza unde vom apela anumite functionalitati
public class Main {
    public static void main(String[] args) {

        Persoana persoana = new Persoana("Ana", 25, 1.67, 45, 'F');
        Persoana persoana1 = new Persoana("Cornel", 16, 1.78, 76, 'M');
//        persoana.printeazaDetaliiDesprePersoana();
//        persoana1.printeazaDetaliiDesprePersoana();

//        System.out.println("Am initializat o persoana cu numele " + persoana.nume);

//        persoana.printeazaDetaliiDesprePersoana();
//        System.out.println("Peste un an " + persoana.nume + "va avea ");
//        persoana.varsta = persoana.cresteVarsta();
//        System.out.println(persoana.varsta);

//        System.out.println("Peste un an " + persoana.nume + " va avea " + persoana.cresteVarsta());
//        System.out.println(persoana.toString());

        Persoana fata = new Persoana("Elena", 30, 1.76, 60, 'F');

//        System.out.println("Am initializat o persoana cu numele " + fata.nume);
//        fata.printeazaDetaliiDesprePersoana();

//        System.out.println("Peste un an " + fata.nume + "va avea ");
//        fata.varsta = fata.cresteVarsta();
//        System.out.println(fata.varsta);

//        System.out.println("Peste un an " + fata.nume + " va avea " + fata.cresteVarsta());
//        System.out.println(fata.toString());
//        System.out.println(persoana);

        // 1. Creati o clasa Student care sa contina variabilele String nume, int varsta. Alocati valoarea 22 la varsta si
        // iar la nume "Jhon" prin crearea unui obiect al clasei student.
        // 2. Modificati clasa Student, adaugand un field String numarTelefon.
        //Creati o metoda apeleaza() care va primi un parametru String numar telefon
        // Metoda va afisa textul :
        //"Studentul x, avand numarul de telefon y, a facut un ape catre numarul de telefon Z"
        // 3. Modificati metoda apeleaza() astfel incat stundetul sa introduca numarul pe care vrea sa il apeleze
        // folosind un Scanner.

        Student student = new Student("Jhon", 22, "065433");
        System.out.println(student.toString());
        student.apeleaza("056762");
        student.apeleaza2();
    }
}
