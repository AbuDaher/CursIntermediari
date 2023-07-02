package curs4;

public class Password {
    // Rezolvati folosind characters Table.
    // 1. Parola trebuie sa aiba minim 8 caractere.
    // 2. Parola trebuie sa contina minim o majuscula.
    // 3. Parola trebuie sa contina minim o cifra.
    // 4. Parola trebuie sa contina minim un simbol.

    // 5.  Creeaza o metoda care primeste o parola  si returneaza true daca metodele de mai sus sunt valide.


    public static boolean parolaAreOptCaractere(String pass) {
        return pass.length() >= 8;
    }

    public static boolean parolaAreMajuscula(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean parolaAreCifra(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean parolaAreSimbol(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifica(String password){
       return parolaAreOptCaractere(password)
               && parolaAreCifra(password)
               && parolaAreSimbol(password)
               && parolaAreMajuscula(password);
    }
}



