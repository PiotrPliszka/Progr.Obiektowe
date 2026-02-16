package zad2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90, 120, 140));
        Athlete a1 = new Athlete("XD", list);
        Athlete clone = a1.clone();
        clone.lapTimes.add(200);
        System.out.println(a1);
        System.out.println(clone);
    }
}
