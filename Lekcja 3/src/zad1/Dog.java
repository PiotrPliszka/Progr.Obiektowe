
package zad1;

import java.util.Objects;

public class Dog {

    public String name;
    public int age;
    public String breed;
    public String ownerName;
    public String color;

    public Dog(String name, int age, String breed, String ownerName, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + " to pies rasy: " + getBreed() + " koloru: " + getColor() + " ma " +
                getAge() + " lat, a jego właścicielem jest: " + getOwnerName();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Dog dog)) {
            return false;
        }
        return dog.getAge() == this.getAge() &&
                dog.getName().equals(this.getName()) &&
                dog.getBreed().equals(this.getBreed()) &&
                dog.getOwnerName().equals(this.getOwnerName()) &&
                dog.getColor().equals(this.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getBreed(), getOwnerName(), getColor());
    }
}
