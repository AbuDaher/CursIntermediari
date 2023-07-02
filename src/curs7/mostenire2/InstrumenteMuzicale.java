package curs7.mostenire2;

public class InstrumenteMuzicale {
    String culoare;
    double pret;
    double vechime;
    String marca;

    public InstrumenteMuzicale(String culoare, double pret, double vechime, String marca) {
        this.culoare = culoare;
        this.pret = pret;
        this.vechime = vechime;
        this.marca = marca;
    }

    public void scoatesunete (){
        System.out.println("Instrumentul scoate sunete");

    }

    @Override
    public String toString() {
        return "InstrumenteMuzicale{" +
                "culoare='" + culoare + '\'' +
                ", pret=" + pret +
                ", vechime=" + vechime +
                ", marca='" + marca + '\'' +
                '}';
    }
}
