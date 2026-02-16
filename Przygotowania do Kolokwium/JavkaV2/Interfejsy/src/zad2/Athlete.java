package zad2;

import java.util.ArrayList;

public class Athlete implements Cloneable{
    public String name;
    public ArrayList<Integer> lapTimesp;

    public Athlete(String name, ArrayList<Integer> lapTimesp) {
        this.name = name;
        this.lapTimesp = lapTimesp;
    }

    @Override
    public Athlete clone() {
        try {
            Athlete clone = (Athlete) super.clone();
            clone.lapTimesp = new ArrayList<Integer>(lapTimesp);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimesp=" + lapTimesp +
                '}';
    }
}
