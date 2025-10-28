import zad1.*;
import zad2.*;
import zad3.*;
import zad4.*;

public class Main {
    public static void main(String[] args) {
//        ZAD1

        Dog pies1 = new Dog("Burek", 7, "Somoyed", "Bartek", "White");

//        System.out.println(pies1.getName() + " " + pies1.getAge() + " " + pies1.getOwnerName() + " "
//                + pies1.getBreed() + " " + pies1.getColor());


//        KAżdy obiekt kiedy jest sobie równy musi
//        System.out.println(pies1);


        Person p1 = new Person("Bartek", "Rosman", 27);
        Person p2 = new Person("Bartek", "Rosman", 27);

//        System.out.println(p1.equals(p2));


//        ZAD2
        Vechicle v1 = new Vechicle("Dodge", "Challanger", 2016);
        Vechicle v2 = new Vechicle("Dodge", "Challanger", 2016);

//        System.out.println(v1);
//        System.out.println(v1.equals(v2));
//        System.out.println(v1.hashCode() == v2.hashCode());


//        ZAD3
        Results r1 = new Results("Jan", "Kowalski", 3);
        r1.addResult(0, 80);
        r1.addResult(1, 90);
        r1.addResult(2, 70);

        Results r2 = new Results("Jan", "Kowalski", 3);
        r2.setResults(new int[]{80, 90, 70});

        System.out.println(r1);
        System.out.println("Czy r1 == r2? " + r1.equals(r2));
        System.out.println("Hash r1: " + r1.hashCode());
        System.out.println("Hash r2: " + r2.hashCode());


//        ZAD4
        System.out.println("Wartość liczby PI: " + Mathematics.PI);

        double promien = 5.0;
        double poleKola = Mathematics.PI * promien * promien;
        System.out.println("Pole koła o promieniu " + promien + " wynosi: " + poleKola);

    }
}
