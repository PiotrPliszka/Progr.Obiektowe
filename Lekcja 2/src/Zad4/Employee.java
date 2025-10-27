package Zad4;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private int age;
    private double salary;

    public Employee(String name, String lastName, String position,
                    int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void showInformation() {
        System.out.println("Dane pracownika:");
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.lastName);
        System.out.println("Stanowisko: " + this.position);
        System.out.println("Wiek: " + this.age);
        System.out.println("Zarobki: " + this.salary);
    }
}