package zad3;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int result = Double.compare(o1.price, o2.price);
        if (result != 0){
            return result;
        }
        else{
            return Integer.compare(o1.id, o2.id);
        }
    }
}
