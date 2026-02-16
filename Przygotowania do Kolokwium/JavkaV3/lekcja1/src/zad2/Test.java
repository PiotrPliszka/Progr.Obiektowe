package zad2;

import org.w3c.dom.ls.LSOutput;

public class Test {
    Address a1 = new Address("XD", 79, "07-430", "Olsztyn");
    Person p1 = new Person("Piotr", "Pliszka", a1);

    static void main(String[] args) {
        Address a1 = new Address("XD", 79, "07-430", "Olsztyn");
        Person p1 = new Person("Piotr", "Pliszka", a1);
        System.out.println(p1);
    }
}
