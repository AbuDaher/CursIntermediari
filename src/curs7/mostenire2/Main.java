package curs7.mostenire2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Clasa parinte (Animal) -> clasa de baza , clasa primara, super clasa, super-tip;
        // Clasa copil (Pisica, Hamster, Catel) -> clasa derivata, clasa copil, sub-clasa, sub-tip;
        // keyword-ul extends -> trebuie sa punem clasa de unde mostenim
        // Mostenirea : reutilizarea functionalitatilor , exinderea capabilitatilor obiectelor si la modelarea
        // comportamentului

        Pian pian1 = new Pian("maro", 1200, 5, "brandPian1");
        Pian pian2 = new Pian("mov", 1800, 13, "brandPian2");
        Pian pian3 = new Pian("roz", 1100, 6, "brandPian3");
        Pian pian4 = new Pian("alb", 1500, 20, "brandPian4");
        Pian pian5 = new Pian("negru", 2200, 65, "brandPian5");
        ArrayList<Pian> listaPian = new ArrayList<>(Arrays.asList(pian1, pian2, pian3,pian4,pian5));

//        for (Pian item: listaPian ){
//            System.out.println(item);
//        }

        System.out.println("--------------");
         listaPian.add(new Pian("gri", 2300, 45,"brandPian6"));
//        for( int i = 0; i < listaPian.size(); i++){
//            System.out.println(listaPian.get(i));
//
//        }
        printeazaInstrumenteleDeTipPian(listaPian);
    }
    public static void printeazaInstrumenteleDeTipPian(ArrayList<Pian> listaPian){
        for (Pian item: listaPian ){
            System.out.println(item);
        }

        Fluier fluier = new Fluier("maro", 150, 4,"fluierUnu", "lemn");
        System.out.println(fluier);

        Toba toba = new Toba("negru", 340,24, "tobaUnu");
        System.out.println(toba);

        Chitara chitara = new Chitara("galbena", 560, 12, "chitaraUnu");
        System.out.println(chitara);

    }

}
