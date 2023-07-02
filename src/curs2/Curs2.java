package curs2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Curs2 {
    public static void main(String[] args) {
        ArrayList <String> listaCuvinte = new ArrayList<>(Arrays.asList("Ana", "Maria", "ANA", "Iona", "AnA"));
        cautaCuvant("Ana",listaCuvinte );
    }


    public static void cautaCuvant(String cuvant, ArrayList<String> ListaCuvinte){
        int contor = 0;
        for(int i = 0; i < ListaCuvinte.size(); i++){
            if(cuvant.equalsIgnoreCase(ListaCuvinte.get(i))){
             contor +=1;
            }
        }
        System.out.println(contor);
    }
}
