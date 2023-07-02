package curs8_ModificatoriV2;
public class User {
    String username;
    private String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        if(password.length()<8) {
            System.out.println("Parola trebuie sa aiba minim 8 caractere");
        }else {
                this.password = password;

        }
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
