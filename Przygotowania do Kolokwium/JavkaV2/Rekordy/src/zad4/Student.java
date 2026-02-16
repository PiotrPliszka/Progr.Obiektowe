package zad4;

import java.util.ArrayList;

public record Student(String firstName, String lastName, ArrayList<Integer> grades) {
    public double averageGrades(){
        double sr = 0.0;
        for (int g: grades){
            sr += g;
        }
        return sr/grades.size();
    }
}
