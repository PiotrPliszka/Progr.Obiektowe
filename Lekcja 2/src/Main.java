import Zad2.*;
import Zad1.*;
import Zad3.*;
import Zad4.*;

public class Main {
    public static void main(String[] args) {

        Book k1 = new Book("k1", "Piotrek", "2025");
        Book k2 = new Book("k2", "Bartek", "2022");
        Book k3 = new Book("k3", "Dawid", "2020");

        Square s1 = new Square(5);

        System.out.println(s1.pole());

        Point p1 = new Point(3, 3);
        Point p2 = new Point(6, 5);

        System.out.println(p1.distance(p2));

        Car c1 = new Car();
//        c1.engineFailure();

        Time t1 = new Time(22, 50);
        Time t2 = new Time(2, 40);

        Dog d1 = new Dog("Tuba", "Owczarek", 10);
        Dog d2 = new Dog("pimpek", "mops");

        t1.show();
        t1.addTime(t2);
        t1.show();

        Employee e1 = new Employee("Bartek", "Rosman", "Student Deb", 27, 2500);
        e1.showInformation();


        System.out.println("Hello world!");
    }
}