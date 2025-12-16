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

        }
    }
}
