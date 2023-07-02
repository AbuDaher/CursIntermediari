package curs8_ModificatoriV2;

public class Main {
    public static void main(String[] args) {
        User user = new User("elena", "pasword1234", "elena.123@gmail.com");


        // parola sa nu aiba mai putin de 8 caractere

        User user2 = new User("elena", "pass", "abc@gmail.com");

        System.out.println(user2);

        System.out.println(user2.getPassword());
        user2.setPassword("abc");
        System.out.println(user2.getPassword());

    }
}
