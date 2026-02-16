package zad2;

import java.util.ArrayList;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

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
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.lapTimes = new ArrayList<Integer>(this.lapTimes);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
