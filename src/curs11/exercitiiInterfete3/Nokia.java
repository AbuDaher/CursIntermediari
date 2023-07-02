package curs11.exercitiiInterfete3;

public class Nokia implements ITelephoneBehavior{
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Nokia suna pe numarul " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Nokia se incarca. ");

    }
}
