package curs9_abstractizare3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> listaelevi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.println("Introdu numele de familie");
            String numeFamilie = sc.nextLine();
            System.out.println("Introdu prenumele");
            String prenume = sc.nextLine();
            System.out.println("Introdu varsta");
            int varsta = sc2.nextInt();
            System.out.println("Introdu facultatea");
            String facultate = sc.nextLine();
            System.out.println("Introdu numar matricol");
            int nrMatricol = sc2.nextInt();
            listaelevi.add(new Student(numeFamilie, prenume, varsta, facultate, nrMatricol));
        }
//        public static void parcurgeLista (ArrayList <Student> listaelevi) {
//            for (Student parcurgelista : listaelevi) {
//                System.out.println(parcurgelista);
//            }
//        }
//        public static void verificaNumele (ArrayList < Student > listaelevi, String numeFamilie){
//            int contor = 0;
//            for (int i = 0; i < listaelevi.size(); i++) {
//                if (listaelevi.get(i).getNume().equalsIgnoreCase(numeFamilie)) {
//                contor++;
//                }
//            }
        }
    }
