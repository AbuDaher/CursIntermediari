package curs5ClaseSiObiecte;

import java.util.Scanner;

public class Student {

    String nume;
    int varsta;
    String numarTelefon;

    Scanner sc = new Scanner(System.in);

    public Student(String nume, int varsta, String numarTelefon) {
        this.nume = nume;
        this.varsta = varsta;
        this.numarTelefon = numarTelefon;
    }

    public void apeleaza(String numarTelefon){
        System.out.println("Studentul " + nume + " avand numarul de telefon " +this.numarTelefon +
                " a facut un ape catre numarul de telefon " + numarTelefon); ;

    }
    public void apeleaza2(){
        System.out.println("Introdu numarul pe care vrei sa il apelezi: ");
        String numarTelefon = sc.nextLine();
        System.out.println("Studentul" + nume + " avand numarul de telefon " + this.numarTelefon +
                " a facut un ape catre numarul de telefon " + numarTelefon);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

