package curs9_abstractizare2;

public class Main {
    public static void main(String[] args) {
        // Creati clasa InstrumenteMuzicala, care are metoda playMuzic()
        //Creati claseke ciopil Chitara, Pian, Saxofon
        //Sa initializam un obiect de fiecare tip de instrument si sa il facem sa cante
        //Fiecare instrument trebuie sa aiba propria lui implementare a metodei playMuzic()

        Chitara chitara = new Chitara();
        chitara.playMuzic();
        Pian pian = new Pian();
        pian.playMuzic();
        Saxofon saxofon = new Saxofon();
        saxofon.playMuzic();
    }
}
