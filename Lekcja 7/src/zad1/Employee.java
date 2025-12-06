package zad1;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    public String name;
    public double salary;
    public LocalDate employmentDate;

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
                "employmentDate=" + employmentDate +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
