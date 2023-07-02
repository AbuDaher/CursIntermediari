package Curs3;
public class Recapitulare {
    public static void main(String[] args) {
//        afiseazaTextUnu();
//        afiseazaTextDoi();
//        System.out.println("----------");
//        System.out.println(returneazaTextUnu());
//        System.out.println(returneazaTextUnu() + returneazaTextDoi());
          System.out.println(inmutesteNumerele(2, 4));
          System.out.println(adunaNumerele(4, 5));
          System.out.println(inmutesteNumerele(2, 4) + adunaNumerele(1, 2));

    }
    public static void afiseazaTextUnu(){
        System.out.println("Marian bate mingea in curtea scolii");
    }
    public static void afiseazaTextDoi(){
        System.out.println(" generale br 179");
    }
    public static String returneazaTextUnu(){
        return "Marian bate mingea in curtea scolii";
    }
    public  static String returneazaTextDoi(){
        return " generale br 179";
    }
    public static int inmutesteNumerele(int nr1, int nr2){
        int inmultire = nr1 * nr2;
        return inmultire;
    }
    public static int adunaNumerele(int a, int b) {
        int suma = a + b;
        return suma;
    }




}
