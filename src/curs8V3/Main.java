package curs8V3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(20, 180, 50, "Vlad");
        System.out.println(student);

        student.setVarsta(200);
        System.out.println(student);
        System.out.println(student.getVarsta());
        System.out.println(student);
        student.setNume("Al");
        System.out.println(student.getNume());
        student.setNume("Alan");
        System.out.println(student.getNume());
    }
}
