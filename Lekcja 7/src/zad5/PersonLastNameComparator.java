package zad5;

import java.util.Comparator;

public class PersonLastNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.lastName.compareTo(o2.lastName);
        if (result > 0){
            return 1;
        }
        else if (result < 0) {
            return -1;
        }
        else {
            int result2 = o1.fistName.compareTo(o2.fistName);
            if (result2 > 0){
                return 1;
            }
            else if (result2 < 0){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
