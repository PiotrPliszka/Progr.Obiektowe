package zad5;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.firstName.compareTo(o2.firstName);
        if (result != 0){
            return result;
        }
        else{
            return o1.lastName.compareTo(o2.lastName);
        }
    }
}
