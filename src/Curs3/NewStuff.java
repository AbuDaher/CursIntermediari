package Curs3;

public class NewStuff {
    public static void main(String[] args) {

//        int numar = 123;
//        int ultimacifra = numar%10; // -> 3
//        System.out.println(ultimacifra);
//        numar = numar / 10; // ->12
//        System.out.println(numar);
//        ultimacifra = numar % 10; // ->2
//        System.out.println(ultimacifra);
//        numar = numar /10 ; // -> 1
//        System.out.println(numar);
//        ultimacifra = numar % 10; //->1
//        System.out.println(ultimacifra);
//        numar = numar / 10; // -> 0
//        System.out.println(numar);
        System.out.println(sumaCifrelor(1111111));
        System.out.println(inversulNumarului(123));
        System.out.println(inversulNumarului1(121));
    }

    // scrie o metoda care realizeaza suma cifrelor unui numar. Metoda va returna suma cifrelor unui numar.
    public static int sumaCifrelor(int numar){
        int suma = 0;
        while(numar > 0 ) {
            int ultimacifra = numar % 10;
            suma += ultimacifra;
            numar = numar / 10;
        }
            return suma;
    }

    // Scrie o metoda care va returna inversul unui numar;
    public static int inversulNumarului(int numar){
        int numarInversat = 0;
        while(numar > 0) {
            int ultimaCifra = numar % 10;
            numarInversat = numarInversat* 10 + ultimaCifra ;
            numar = numar / 10;
        }
        return numarInversat;
    }
    public static int inversulNumarului1(int numar){
        int numarInversat = 0;
        while(numar > 0) {
            int ultimaCifra = numar % 10;
            numarInversat = numarInversat* 10 + ultimaCifra ;
            numar = numar / 10;
        }
        if(numar == numarInversat){
            System.out.println("palidorm");
        }
        else {
            System.out.println("nu este palidrom");
        }
        return numarInversat;
    }
}
