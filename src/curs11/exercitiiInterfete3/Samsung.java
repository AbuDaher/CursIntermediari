package curs11.exercitiiInterfete3;

public class Samsung implements ISmartphoneBehavior{
    @Override
    public void takeScreenshot() {
        System.out.println("Samsung a facut o captura de ecran ");
    }

    @Override
    public void downloadFromStore(String numeAplicatie) {
        System.out.println("Samsung A descarcat aplicatia " + numeAplicatie);

    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Samsung face un apel catre : " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Samsung se incarca .");

    }
}
