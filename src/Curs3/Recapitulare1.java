// 7. Scrie o metodă  care va contine 2 paramentri de tip int( int numar,  int putereaNumarului), apoi returneaza numarul la puterea numarului introdus. Apeleaza metoda de 5 ori cu valori diferite.
//Exemplu : input numar : 2, puterea numerului 3
// output : 8 ( deoarece este 2 la puterea 3, 2*2*2)

package Curs3;

public class Recapitulare1 {
    public static void main(String[] args) {
        System.out.println(rezultat(2, 3));
        System.out.println(rezultat(3, 3));
        System.out.println(ridicareLaPutereV2(3.0, 3.0));
    }
    public static int rezultat(int numar, int putereaNumarului){
        int expresie = 1;
       for (int i = 1; i <= putereaNumarului; i++){
           expresie *= numar;
       }
       return expresie;
    }
    public static double ridicareLaPutereV2(double n, double power){
        return Math.pow(n,power);
    }
}
