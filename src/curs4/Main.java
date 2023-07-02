package curs4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // metodele statice declarate in alte clase se apeleaza prin numele clasei;
////        Caine.mananca();
//
//        Persoana.saluta();
//
//        Caine.latra();
//
//        Caine.musca();
//
//        Persoana.saluta();
//
//        Caine.mananca();

        System.out.println("-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu o parola pentru a verifica deca este valida: ");
        String parolaIntrodusa = sc.next();
        System.out.println("Parola noastra corespunde tuturor criteriilor -> Raspuns: " + Password.verifica(parolaIntrodusa));;

    }
}
