package Zad4;

public class Dog {
    String name;
    String breed;
    int age;


    public Dog(String name, String breed) {
        this(name, breed, 1);
    }

    public Dog(String name, String breed, int age) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }
}