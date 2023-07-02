package curs11.exercitiiInterfete3;

import java.sql.SQLOutput;

public class Iphone implements ISmartphoneBehavior{
    @Override
    public void takeScreenshot() {
        System.out.println("Iphone a facut o captura de ecran ");
    }

    @Override
    public void downloadFromStore(String numeAplicatie) {
        System.out.println("Iphone a descarcat aplicatia " + numeAplicatie);

    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Iphone face un apel catre : " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Iphone se incarca .");

    }
}
