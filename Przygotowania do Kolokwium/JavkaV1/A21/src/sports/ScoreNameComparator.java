package sports;

import java.util.Comparator;

public class ScoreNameComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        int s = Integer.compare(o1.score(), o2.score());
        if (s != 0){
            return s;
        }else{
            return o1.name().compareTo(o2.name());
        }
    }
}
