package curs4;

import java.util.Scanner;

public class Exercitii1 {
    public static void main(String[] args) {
//        System.out.println(numaraVocale("ana"));
        // scrie o metoda care se se numeste verifica numarul vocalelor din cuvant "VerificaNumarulVocalelorDinCuvant",
        //        // primeste ca parametru un String si va returna cate vocale sunt in cuvant
//         String nume = "Elena";
//         System.out.println("Cate litere sunt in string: " + nume.length());
////        Scanner sc = new Scanner(System.in);
////        char a = sc.next().charAt(0);
//        System.out.println("Prima litera din cuvant este: " + nume.charAt(0));
//        System.out.println("A 2-a litera din cuvant este: " +nume.charAt(1));
//        System.out.println("A 3-a litera din cuvant este: " +nume.charAt(2));
//        System.out.println("A 4-a litera din cuvant este: " +nume.charAt(3));
//        System.out.println("A 5-a litera din cuvant este: " +nume.charAt(4));
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Introdu un nume:");
            String numeIntrodus = sc.nextLine();
            System.out.println("Numarul de vocale din cuvat este :" + numaraVocale(numeIntrodus));
            if (numeIntrodus.equalsIgnoreCase("Stop")){
                System.out.println("Ai apasat stop. Aplicatia noastra s-a terminat.");
                break;
            }
        }
    }
    public static int numaraVocale(String cuvant){
        int numarVocale = 0;
//        char [] vocale = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i< cuvant.length(); i++){
            if( cuvant.charAt(i) == 'a' || cuvant.charAt(i) == 'e' || cuvant.charAt(i) == 'i' || cuvant.charAt(i) == 'o'
                    || cuvant.charAt(i) == 'u' || cuvant.charAt(i) == 'A' || cuvant.charAt(i) == 'E' ||
                    cuvant.charAt(i) == 'I' || cuvant.charAt(i) == 'O'
                    || cuvant.charAt(i) == 'U')
            {
                numarVocale += 1;
                System.out.println(cuvant.charAt(i));
            }

        }
        return numarVocale;
    }
}
