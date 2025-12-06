package zad5;

import java.time.LocalDate;

public class Person {
    public String fistName;
    public String lastName;
    public LocalDate birthDate;

    public Person(String fistName, String lastName, LocalDate birthDate) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
