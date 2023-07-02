package curs11_interfete.masini;

// interfata nu poate avea constructori si nu poate fi instantiate;
// daca avem fields-uri acestea sunt statice si finale;

public class Masina implements ITurboDriveable, IFlyable2{

    // interfata ne ajuta sa dam o abilitate unei clase
    // cand nu putem avea o mostenire multipla, o clasa o mostenim, ne putem crea interfetele noastre in clasa

    String brand;

    int anulFabricatiei;

    @Override
    public void turboDrive() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {

    }
}
