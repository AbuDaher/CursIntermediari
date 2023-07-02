package curs11.exercitiiInterfete3;

public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Motorola motorola = new Motorola();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();
        nokia.call("9845678");
        nokia.charge();
        motorola.call("65432");
        motorola.charge();
        iphone.call("86543");
        iphone.charge();
        iphone.downloadFromStore("Insta");
        iphone.takeScreenshot();
        samsung.call("345678");
        samsung.charge();
        samsung.downloadFromStore("Youtube");
        samsung.takeScreenshot();
    //Se dau interfetele TelephoneBehavior si SmartphoneBehavior
        // Un telefon poate suna ( va avea o metoda void call(String telephoneNumber)),si o metoda void charge(),
        //deoarece un telefon poate fi incarcat
        //Un smartphone poate suna, poate fi incarcat, poate face screenshot-uri (metoda takeScreenshot())
        //si poate descarca aplicayoo de pe store ( metoda void downloadFromStore() )
        //Definiti clasele Nokia. Motorola ( nu sunt smart), Samsung si Iphone ( sunt smart)
        // si legati-le de interfetele specifice
        //Testati functionalitatile

    }
}
