package curs10_Polimorfism;

// avem aceeasi metoda, cu parametri diferinti
// se stie ce metoda va fi apelata inca de la complilare ( compile time), in functie de parametrtul dat


public class PolimorfismStatic {
    public static void main(String[] args) {
        printeazaTipdeDate(8);
        printeazaTipdeDate('s');
        printeazaTipdeDate("Ana are mere");
        printeazaTipdeDate(13.8);
        printeazaTipdeDate(4/2 == 1*2);
        printeazaTipdeDate(4/2 == 5*2);
    }

    public static void printeazaTipdeDate(String variabila){
        System.out.println("Stringul meu este " + variabila);
    }
    public static void printeazaTipdeDate(int variabila){
        System.out.println("Numarul meu este " + variabila);
    }
    public  static void printeazaTipdeDate(char variabila){
        System.out.println("Caracterul meu este " + variabila);
    }
    public  static void printeazaTipdeDate(double variabila){
        System.out.println("Numarul meu este " + variabila);
    }
    public  static void printeazaTipdeDate(boolean variabila){
        System.out.println("Valoarea mea este " + variabila);
    }
}
