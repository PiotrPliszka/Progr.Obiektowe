package zad4;

import java.util.ArrayList;

public record Student(String firstName, String lastName, ArrayList<Integer> list) {
    public double averageGrades(){
        double suma = 0.0;
        for (int a : list){
            suma += a;
        }
        return suma/list.size();
    }
}
