package curs4;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        // Palindrom
        // Scrieti o metoda care va avea ca parametru un numar de tip intregnsi metoda respectiva va returna daca
        // numarul este palidrom sau nu.

         String nume = "Elena";
         System.out.println("Cate litere sunt in string: " + nume.length());
//        Scanner sc = new Scanner(System.in);
//        char a = sc.next().charAt(0);
        System.out.println("Prima litera din cuvant este: " + nume.charAt(0));
        System.out.println("A 2-a litera din cuvant este: " +nume.charAt(1));
        System.out.println("A 3-a litera din cuvant este: " +nume.charAt(2));
        System.out.println("A 4-a litera din cuvant este: " +nume.charAt(3));
        System.out.println("A 5-a litera din cuvant este: " +nume.charAt(4));

        // scrie o metoda care se se numeste verifica numarul vocalelor din cuvant "VerificaNumarulVocalelorDinCuvant",
        // primeste ca parametru un String si va returna cate vocale sunt in cuvant
//        System.out.println(palindrom(12521));
//        System.out.println(palindrom(16591));
//    }
//    public static String palindrom(int numar){
//        int numarAuxiliar = numar;
//        int numarInversat = 0;
//        while(numarAuxiliar > 0) {
//            int ultimaCifra = numarAuxiliar % 10;
//            numarInversat = numarInversat* 10 + ultimaCifra ;
//            numarAuxiliar = numarAuxiliar / 10;
//        }
//        if(numar == numarInversat){
//            return "Palindrom";
//        }
//        else {
//            return "Nu este palindrom";
//        }
    }
}
