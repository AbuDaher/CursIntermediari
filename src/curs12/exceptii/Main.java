package curs12.exceptii;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scrie un program care cere utilizatorului sa introduca de la tastatura 2 numere;
        // la final de program afisati impartirea celor 2

//        Scanner sc = new Scanner(System.in);
//
//   try {
//       System.out.println("Te rog sa introduci un numar");
//       int nr1 = sc.nextInt();
//       System.out.println("Introdu al doilea numar");
//       int nr2 = sc.nextInt();
//       System.out.println("Rezultatul impartirii celor doua numere introduse de uner este " + (nr1/nr2));
//   } catch (ArithmeticException e){
//       System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//       System.out.println(e.getMessage());
//       System.out.println("Nu este tip de date asteptat");
//   }
        try{
            int [] m = new int[2];
            m[8] = 5;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        ArrayList<String> liost = new ArrayList<String>();
        try{
            String s = liost.get(18);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            int num = Integer.parseInt("23544");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }


    }
}
