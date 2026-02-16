package zad4;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = Double.compare(o1.getPrice(), o2.getPrice());
        if (result != 0){
            return result;
        }
        else {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }
}
