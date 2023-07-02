package exercitiiInterfete2;

public class Human implements IEatable, ISwimable{
    @Override
    public void eat() {
        System.out.println("Omul mananca mancare gatita sanatos");
    }

    @Override
    public void swim() {
        System.out.println("Omul inoata in ape linistite");

    }
}
