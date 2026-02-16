package literature;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLiterature {
    static void main(String[] args) {
        Novel n1 = new Novel("Analiza", "Bartek", new ArrayList<Double>(Arrays.asList(2.0, 5.0, 9.0)));
        Novel n11 = new Novel("Analiza", "Bartek", new ArrayList<Double>(Arrays.asList(2.0, 5.0, 9.0)));
        Novel n2 = new Novel("Propabilistyka", "Piotrek", new ArrayList<Double>(Arrays.asList(5.0, 8.0, 9.5)));
        System.out.println(n1);
        n1.addRating(11.5);
        System.out.println(n1);
        n1.removeRating(5.0);
        System.out.println(n1.equals(n11));
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode() == n11.hashCode());
        System.out.println(n1.hashCode() == n2.hashCode());
    }
}
