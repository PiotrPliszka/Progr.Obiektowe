package electronics;

import java.util.ArrayList;
import java.util.Arrays;

public class TestElectronics {
    static void main(String[] args) {
        Radio r1 = new Radio("R55", "Samsung", new ArrayList<>(Arrays.asList(5.0, 5.5, 6.0)));
        Radio r11 = new Radio("R55", "Samsung", new ArrayList<>(Arrays.asList(5.0, 5.5, 6.0)));
        Radio r2 = new Radio("R65", "Huwawei", new ArrayList<>(Arrays.asList(1.0, 2.5, 3.0)));
        System.out.println(r1);
        r1.addStation(10.5);
        System.out.println(r1);
        r1.removeStation(5.0);
        System.out.println(r1.equals(r11));
        System.out.println(r1.equals(r2));
        System.out.println(r1.hashCode() == r2.hashCode());
        System.out.println(r1.hashCode() == r11.hashCode());
    }
}
