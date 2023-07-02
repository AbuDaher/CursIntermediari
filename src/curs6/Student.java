package curs6;

public class Student {
    int id;
    int age;
    String name;
    static int contor = 1;


    public Student(String name, int age) {
        this.id = contor++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
