package curs7.mostenire2;

public class Fluier extends InstrumenteMuzicale{
    String material;

    public Fluier(String culoare, double pret, double vechime, String marca, String material) {
        super(culoare, pret, vechime, marca);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Fluier{" +
                "material='" + material + '\'' +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret +
                ", vechime=" + vechime +
                ", marca='" + marca + '\'' +
                '}';
    }
}
