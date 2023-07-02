package exercitiiInterfete;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(10);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        System.out.println("Patratul are: " + getTotalSides(square) + " laturi");
        System.out.println("Triunghiul are: " + getTotalSides(equilateralTriangle) + " laturi");
        System.out.println("Patratul are perimetrul: " + getPerimeter(square) + " .");
        System.out.println("Triunghiul are perimetrul: " + getPerimeter(equilateralTriangle) +" .");
        //Creati o aplicatie normala cu aceste caracteristici:
        //O interfata numita RegularPolygon cu 2 metode abstracte (return type):
        //getNumSides si getSideLength -
        //O clasa EquilateralTriangle care implementeaza interfata, are getNumSides() si returneaza 3 - implements,
        // si getSideLength() care returneaza o variabila de intanta setata prin contructor( int sideLength;)
        //O clasa Square care implementeza interfata, are metodele getNumSides() si returneaza 4
        // si getSideLength() care returneaza o variabila de intanta setata prin contructor( int sideLength;)
        //In clasa Main, creati 2 metode:
        // - o metoda statica int getTotalSides(RegularPolygon regularPolygon),
        // care asteapta un parametru de tip RegularPolygon si returneaza numarul total de laturi ale tuturor
        //elementelor o metoda statica int getPerimeter(RegularPolygon regularPolygon) si returneaza
        // perimetrul formei abstracte
    }


    public static int getTotalSides(IRegularPolygon regularPolygon){
        return regularPolygon.getNumSides();

    }
    public static int getPerimeter(IRegularPolygon regularPolygon){
        return regularPolygon.getNumSides() * regularPolygon.getSideLength();
    }
}
