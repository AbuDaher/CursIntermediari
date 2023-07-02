package curs6;

public class Broasca {
    String name;
    int age;

    public Broasca(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Broasca(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Broasca{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void arataDetalii(){
        System.out.println("Broasca se numeste " + this.name + " si are varsta " + this.age);

    }

    public void makenoise(){

        System.out.println(this.name + "a scos sunetul Oak");
    }

    public void beaApa(){
        System.out.println(this.name + " be apa");

    }
}
