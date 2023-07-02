package TestFinal.ClaseDeBaza;

import java.util.Scanner;

public abstract class Employee {

    Scanner sc = new Scanner(System.in);

    String name;
    String jobName;
    int age;

    public Employee(String name, String jobName, int age) {
        this.name = name;
        this.jobName = jobName;
        this.age = age;
    }

    public abstract void feedsAnimals();

    public String receivesSalary(){

        System.out.println("What is your job name:( manager/ caretaker / tamer ) : ");
        String job = sc.nextLine();
        if (job.equalsIgnoreCase("manager")){
            return "you will receive 3000 $ for your work.";

        } else if (job.equalsIgnoreCase("")){
            return "you will receive 2000  $  for your work. ";

        } else if (job.equalsIgnoreCase("tamer")){
            return "You will receive 1000 $ for your work. ";

        } else {
            return "Invalid job. ";

        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobName='" + jobName + '\'' +
                ", age=" + age +
                '}';
    }
}
