package zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Employee implements  Comparable<Employee>{
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employmentDate=" + employmentDate +
                '}';
    }

    static void main(String[] args) {
        Employee e1 = new Employee("Piotr", 21.20, LocalDate.of(2020, 3, 20));
        Employee e2 = new Employee("Piotr", 20.20, LocalDate.of(2019, 3, 20));
        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(e1, e2));
        Collections.sort(list);
        for (Employee e : list){
            System.out.println(e);
        }
    }
}
