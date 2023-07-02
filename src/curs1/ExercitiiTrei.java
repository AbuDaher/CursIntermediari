package curs1;

import java.util.Scanner;

public class ExercitiiTrei {
    public static void main(String[] args) {
        //scrie o metoda care sa compare 2 numere, metoda se va numi compara numere si va lua ca parametri 2 numere de tip int.
        // sa se verifice care este numarul mai mare
//        comparaNumere(4, 7);
//        comparaNumere(8, 3);
//        joacaFizzBuzz(3);
//        joacaFizzBuzz(7);
//        joacaFizzBuzz(15);
//        joacaFizzBuzz(5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Te rog sa introduci un numar: ");
            int numarIntrodus = sc.nextInt();
            if (numarIntrodus > 0){
                joacaFizzBuzz(numarIntrodus);
            } else {
                System.out.println("Programul s-a terminat");
                break;
            }
        }
    }
    public static void comparaNumere(int x, int y) {
        if (x > y) {
            System.out.println(" Primul numar " + x + " este mai mare decat numarul al doilea  " + y + " .");
        } else if(x<y) {
            System.out.println(" Al doilea numar " + y + " este mai mare decat  primul numar " + x + " .");
        } else {
            System.out.println("Numerele sunt egale");
        }
    }
    //Scrie o metoda care sa afiseze "Fizz" daca numarul pasat ca parametru este divizibil cu 3 .
    // Sa afiseze "Buzz" daca numarul este divizibil cu 5
    // sa se afiseze FizzBuzz daca numarul este divizibil si cu 3 si cu 5
    // "Numarul nu este divizibil cu 3, 5 sau cu 15


    public static void joacaFizzBuzz(int numar){
        if(numar % 3 == 0 && numar % 5 ==0) {
            System.out.println("FizzBuzz");
        } else if (numar % 3 == 0) {
            System.out.println("Fizz");
        } else if (numar % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Numarul nu este divizibil cu 3, 5 sau 15. ");
        }
    }
    // Modifica problema anterioara astfel incat sa introduci de la tastatura numere repetate, iar pentru fiecare
    // numar introdus se va apela metoda JoacaFizzBuzz
    //programul se va termina la introducerea unui numar negativ.
}
