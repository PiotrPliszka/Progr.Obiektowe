
package zad1;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (firstName == null) {
            this.firstName = "";
        } else if (firstName.isEmpty()) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }

        if (lastName.isEmpty() || lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }


        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person:" + firstName + lastName + " Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person person)) return false;
        return age == person.age
                && firstName.equals(person.firstName)
                && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
