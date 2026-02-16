package trip;

import java.sql.Array;

public class TestTrip {
    static void main(String[] args) {
        Trip t1 = new Trip(10.50, "Olsztyn", new double[]{1.0, 2.0});
        Trip t2 = new Trip(10.50, "Olsztyn", new double[]{1.0, 2.0});
        Trip t3 = new Trip(100.50, "Warszawa", new double[]{1.0, 3.0});
        System.out.println(t1);
        t1.distancesAdd(10.0);
        System.out.println(t1);
        t1.distancesAdd(12.0);
        System.out.println(t1);
        t1.distancesRemove(0);
        System.out.println(t1);
        System.out.println(t1.hashCode());
        System.out.println(t3.hashCode());
        System.out.println(t1.equals(t2));

    }
}
