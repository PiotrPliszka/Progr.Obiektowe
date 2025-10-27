import zad1.*;
import zad2.*;

public class Main {
    public static void main(String[] args) {

        Dog pies1 = new Dog("Burek", 7, "Somoyed", "Bartek", "White");

//        System.out.println(pies1.getName() + " " + pies1.getAge() + " " + pies1.getOwnerName() + " "
//                + pies1.getBreed() + " " + pies1.getColor());


//        KAżdy obiekt kiedy jest sobie równy musi
//        System.out.println(pies1);


        Person p1 = new Person("Bartek", "Rosman", 27);
        Person p2 = new Person("Bartek", "Rosman", 27);

//        System.out.println(p1.equals(p2));
        Vechicle v1 = new Vechicle("Dodge", "Challanger", 2016);
        Vechicle v2 = new Vechicle("Dodge", "Challanger", 2016);

        System.out.println(v1);
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode() == v2.hashCode());

    }
}
