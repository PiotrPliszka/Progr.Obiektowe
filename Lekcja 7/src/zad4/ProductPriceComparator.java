package zad4;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int priceCompare = Double.compare(o1.getPrice(), o2.getPrice());
        if(priceCompare != 0){
            return priceCompare;
        }
        return Integer.compare(o1.getId(), o1.getId());
    }
}
