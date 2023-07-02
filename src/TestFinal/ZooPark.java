package TestFinal;

import TestFinal.ClaseDeBaza.*;
import TestFinal.ClaseDerivate.Bird.*;
import TestFinal.ClaseDerivate.Cashier;
import TestFinal.ClaseDerivate.Fish.*;
import TestFinal.ClaseDerivate.Insect.*;
import TestFinal.ClaseDerivate.Janitor;
import TestFinal.ClaseDerivate.Mammal.*;
import TestFinal.ClaseDerivate.Reptile.*;
import TestFinal.ClaseDerivate.Security;
import TestFinal.ClaseDerivate.Vet;

import java.util.ArrayList;
import java.util.Arrays;


public class ZooPark {
    public static void main(String[] args) {
        Crow crow = new Crow(2002, "Lara", "female", "crow", "Europa",
                "insects");
        Eagle eagle = new Eagle(2003, "Sam", "Male", "eagle", "America",
                "fish");
        Owl owl = new Owl(2020,"Goofy", "male", "owl", "America",
                "worms", 30.5);
        Pelican pelican = new Pelican(2013, "Silly", "female", "pelican",
                "Europa","fish",55.5);
        Swan swan = new Swan(2022, "Sara", "female", "swan", "Africa",
                "fish", 43.7);

//        crow.canFly("10");
//        pelican.gettingOld();
        System.out.println("-------------------------BirdsList-------------------------------------");
        ArrayList<Bird> birdsList = new ArrayList<>(Arrays.asList(crow,eagle, owl, pelican, swan));
        for(Bird bird :birdsList){
            System.out.println(bird);
        }

        BlueTang blueTang = new BlueTang(2015, "Blue", "male", "blueTang",
                true,2,240);
        GoldFish goldFish = new GoldFish(2019,"Goldie", "female", "gold fish", true,
                4, 50);
        Pirahna pirahna = new Pirahna(2009,"Sharp", "male", "piranha",
                false, 2,147);
        Somon somon = new Somon(2016, "Pinky", "female", "somon", false,
                6, 500);
        Tuna tuna = new Tuna(2014, "Tina","female", "tuna", false,4 );

//        pirahna.breathesUnderwater(56);
        System.out.println("-------------------------Fish List-------------------------------------");
        ArrayList<Fish> fishlist = new ArrayList<>(Arrays.asList(blueTang,goldFish,pirahna,somon,tuna));
        for(Fish fish :fishlist){
            System.out.println(fish);
        }

        Ant ant = new Ant(2020, "Aunty", "female", "ant", "Europe",
                "crumbs", 2.6);
        BubleBee bubleBee = new BubleBee(2012, "Buble", "male","bublebee",
                "Africa", "pollen",2.5);
        Butterfly butterfly = new Butterfly(2023, "Butter", "female", "butterfly ",
                "Australia","pollen",5);
        Cricket cricket = new Cricket(2020, "Lazy", "male", "cricket",
                "Europa", "crumbs", 4);
        Dragonfly dragonfly = new Dragonfly(2021, "Dragon", "female", "dragonfly",
                "Australia", "honey", 7);

//        cricket.gettingOld();
        System.out.println("-------------------------Insects List-------------------------------------");
        ArrayList<Insect> insectsList = new ArrayList<>(Arrays.asList(ant,bubleBee, butterfly, cricket, dragonfly));
        for(Insect insect :insectsList){
            System.out.println(insect);
        }

        Cat cat = new Cat(2008, "Lucky", "male", "cat", "Europa",
                "milk", true);
        Deer deer = new Deer(1990, "Bambi", "female", "deer", "America",
                "grass", false);
        Dog dog = new Dog(2000, "Bruno", "male", "dog", "Asia",
                "bones", true);
        Lion lion = new Lion(1999, "Fiona", "female", "lion", "Africa",
                "meat", true);
        Monkey monkey = new Monkey(2001, "Cyta", "male", "monkey", "Africa",
                "bananas", true);

        System.out.println("-------------------------Mammal List-------------------------------------");
        ArrayList<Mammal> mammalList =  new ArrayList<>(Arrays.asList(cat, deer, dog, lion, monkey));
        for(Mammal mamal : mammalList){
            System.out.println(mamal);
        }

        Aligator aligator = new Aligator(2025, "Ali", "male", "aligator",
                "Africa", "dears", true);
        Anaconda anaconda = new Anaconda(2000, "Gill", "male", "anaconda",
                "America", "enerythingthatmoves", true);
        Cobra cobra = new Cobra(2021, "Sinky", "female", "cobra", "Asia",
                "rats", true);
        Iguana iguana = new Iguana(2023, "Mimi", "female", "iguana",
                "Australia", "insects", false);
        Tortoise tortoise = new Tortoise(2022, "Yoda", "male", "tortoise",
                "America", "srimps");
        System.out.println("-------------------------Reptile List-------------------------------------");
        ArrayList<Reptile>  reptileList= new ArrayList<>(Arrays.asList(aligator, anaconda, cobra, iguana, tortoise));
        for(Reptile reptile:reptileList){
            System.out.println(reptile);
        }

        Cashier cashier1 = new Cashier("George", "cashier", 34, true);
        Cashier cashier2 = new Cashier("Stela", "cashier", 24, true);
        System.out.println("-------------------------Cashier List-------------------------------------");
        ArrayList<Cashier> cashierList = new ArrayList<>(Arrays.asList(cashier1,cashier2));
                for(Cashier cashier :cashierList){
                    System.out.println(cashier);
                }

        Janitor janitor1 = new Janitor("Alias", "janitor", 21, 8);
        Janitor janitor2 = new Janitor("Mike", "janitor", 51, 8);
        System.out.println("-------------------------Janitor List-------------------------------------");
        ArrayList<Janitor> janitorList = new ArrayList<>(Arrays.asList(janitor1,janitor2));
        for(Janitor janitor :janitorList){
            System.out.println(janitor);
        }

        Security security1 = new Security("Luke", "guardian", 23,3,
                true);
        Security security2 = new Security("Mathias", "guardian", 33,3,
                true);
        System.out.println("-------------------------Security List-------------------------------------");
        ArrayList<Security> securityList = new ArrayList<>(Arrays.asList(security1, security2));
        for(Security guard :securityList){
            System.out.println(guard);
        }
        Vet vet1 = new Vet("Genny", "vet",45, 5, 8);
        Vet vet2 = new Vet("Miriam", "vet",25, 5, 8);
        System.out.println("-------------------------Vet List-------------------------------------");
        ArrayList<Vet> vetList = new ArrayList<>(Arrays.asList(vet1, vet2));
        for(Vet vet :vetList){
            System.out.println(vet);
        }
        System.out.println("-------------------------Animal List-------------------------------------");
        ArrayList<Animal> totalList = new ArrayList<>(Arrays.asList(crow, eagle, owl, pelican, swan, blueTang, goldFish,
                pirahna, somon, tuna, ant, bubleBee, butterfly, cricket, dragonfly, cat, deer, dog, lion, monkey,aligator,
                anaconda,cobra, iguana, tortoise));
        for(Animal animal: totalList){
            System.out.println(animal);
        }
        System.out.println("-------------------------Employee List-------------------------------------");
        ArrayList<Employee> employeesList = new ArrayList<>(Arrays.asList(cashier1, cashier2, janitor1, janitor2,
                security1, security2, vet1, vet2));
        for(Employee employee: employeesList){
            System.out.println(employee);
        }
    }
}
