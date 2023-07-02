package exercitiiInterfete2;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        Cat cat = new Cat();
        Submarin submarin = new Submarin();

        human.eat();
        human.swim();
        cat.eat();
        submarin.swim();

        // Declarati clasale Human, Cat, Submarin si interfetele Swimable( are metoda void swim(); ),
        // Eatable ( void eat();)
        // Stabiliti contractele necesare ( tb sa stabilim in  ce clasa sa implementam interfetele Human putem sa extindem interfetele)
        // Initializati un obiect de fiecare tip ( human, cat, submarin) + aplelati functionalitatile specifice;
    }
}
