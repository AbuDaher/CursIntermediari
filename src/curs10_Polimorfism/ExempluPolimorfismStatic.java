package curs10_Polimorfism;

// in functie de parametri se executa de motoda care va urma sa fie apelata

public class ExempluPolimorfismStatic {
    public static void main(String[] args) {

        adunaNumere(3,7,6);
        adunaNumere(7,6);
        adunaNumere(7,6.45);

    }

    public static void adunaNumere(int x, int y){
        System.out.println("Suma numerelor este " + (x+y));
    }
    public static void adunaNumere(int x, double y){
        System.out.println("Suma numerelor este " + (x+y));
    }
    public static void adunaNumere(int x, int y, int z){
        System.out.println("Suma numerelor este " + (x+y+z));
    }
}
