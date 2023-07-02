package curs6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Broasca broasca1 = new Broasca("Yoda", 13);
        Broasca broasca2 = new Broasca("Jedi");

        Broasca broasca4 = new Broasca("Mimi", 10);
        Copil copil2 = new Copil("iulia", 11, new Broasca("Ana", 4),new Copil("Maria", 10,
                new Broasca("Broasca")));
        Copil copil = new Copil("Elena", 12, broasca4,copil2 );

//        System.out.println(copil);
//        System.out.println(copil2);

        //1.Creati clasa Student.
        //2.Studentul va avea 2 campuri int age, si String name.
        //3. Supraincarcati metoda to string pentru a afisa detaliile studentului la consola.
        //4. In main sa creem 10 studenti, fiecare student va avea un id unic, iar id-ulva fi creat in momentul initializarii.

        Student student1 = new Student("Ana", 18);
        Student student2 = new Student("ANA", 18);
        Student student3 = new Student("Sara",18);
        Student student4 = new Student("IONA",18);
        Student student5 = new Student("GELU",18);

//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//        System.out.println(student5);



//        copil2.hranesteAnimalulDeCompanie();
//        broasca4.makenoise();

//        broasca1.arataDetalii();
//        broasca2.arataDetalii();

//        System.out.println(broasca1.toString());
//        System.out.println(broasca2);
//        broasca1.makenoise();
//        afiseazaNumar(5);
//        Main.afiseazaNumar(7);
//        OperatiiMatematice.afiseazaSumaNumerelor(5,5);
//        System.out.println(OperatiiMatematice.afiseazaSumaNumerelor(5, 5, 5));


        //creeaza o clasa elev care va avea campurile: nume, varsta,si un camp static scoala.
        // fiecare student va avea metoda de printeaza detalii, iar in clasa student vom avea si metoda schimba scoala.
        // aceasta metoda va modifica numele scolii in care sunt inscrisi elevii.
        // facem 5 elevi in Main si sa ii adaugam intr-o lista.
        // Afiseaza, Schimba scoala, afiseaza.

        Elev elev1 = new Elev("Ayan", 12);
        Elev elev2 = new Elev("Sara", 9);
        Elev elev3 = new Elev("Lucky", 19);
        Elev.schimbaScoala("Scoala 5");
        ArrayList<Elev> elevi = new ArrayList<>(Arrays.asList(elev1, elev2,elev3));
        for (Elev elev: elevi) {
            System.out.println(elev);
        }
    }
    public static void afiseazaNumar(int numar){
        System.out.println(numar);
    }
}
