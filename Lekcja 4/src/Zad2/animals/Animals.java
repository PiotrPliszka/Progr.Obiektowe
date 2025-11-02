package Zad2.animals;

import Zad2.mammals.Dog;

public class Animals{
    protected String species;
    private int age;

    public Animals(String species, int age) {
        this.species = species;
        this.age = age;
    }

    static void main() {
        Animals a1 = new Animals("Burek", 21);
        Dog d1 = new Dog("Azor", 22);
//        System.out.println(d1.age);
    }
}
