package zad2;

import java.util.ArrayList;

public class Athlete implements Cloneable {
    public String name;
    public ArrayList<Integer> lapTimes;

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }



    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + lapTimes +
                '}';
    }

    @Override
    public Athlete clone() {
        try {
            Athlete clone = (Athlete) super.clone();

            clone.lapTimes = new ArrayList<>(this.lapTimes);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
