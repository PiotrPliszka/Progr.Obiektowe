package zad4;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(5,5,2));
    Student s1 = new Student("Piotr", "Pliszka", a1);

    static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(5,5,2));
        Student s1 = new Student("Piotr", "Pliszka", a1);

        System.out.println(s1.averageGrades());
    }
}
