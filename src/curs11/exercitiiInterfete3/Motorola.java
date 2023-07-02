package curs11.exercitiiInterfete3;

public class Motorola implements ITelephoneBehavior{
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Motorola suna la numarul " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Motorola se incarca .");
    }
}
