package Curs3;//Sa se declare 6 metode(suma, diferenta, inmultirea, impartirea, modulo, ridicare la putere).
//In main sa se ceara de la user un numar, un semn(operator) si inca un numar si
// returneaza calculul facut cu acele numere in functie de operatorul intodus.
// Folositi switch in main pentru operatori.
//Semnele valide sunt: +, -, *, /, %, ^

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); // int
        Scanner sc2 = new Scanner(System.in); // operator
        System.out.println("Introud primul operand x: ");
        int operand1 = sc1.nextInt();
        System.out.println("Introdu al doilea operand y : ");
        int operand2 =sc1.nextInt();
        System.out.println(" Introdu operandul  { +, -, *, /, %, ^}: ");
        String operator = sc2.nextLine();
        switch (operator) {
            case "+":
                System.out.println(adunare(operand1,operand2));
                break;
            case "-":
                System.out.println(scadere(operand1,operand2));
                break;
            case "*":
                System.out.println(inmultire(operand1,operand2));
                break;
            case "/":
                System.out.println(impartire(operand1,operand2));
                break;
            case "%":
                System.out.println(modulo(operand1,operand2));
                break;
            case "^":
                System.out.println(ridicareLaPutere(operand1,operand2));
                break;
            default:
                System.out.println("Operatie invalida");
                break;
        }

    }
    public static int adunare(int x, int y){
        int suma = x + y;
        return suma ;
    }
    public static int scadere(int x, int y){
        int scadere = x - y;
        return scadere ;
    }
    public static int inmultire(int x, int y){
        int inmultire = x * y;
        return inmultire;
    }
    public static int impartire(int x, int y){
        int impartire = x / y;
        return impartire;
    }
    public static int modulo(int x, int y){
        int rest = x % y;
        return rest ;
    }
    public static int ridicareLaPutere(int n, int power){
        return (int)Math.pow(n,power);
    }

}
