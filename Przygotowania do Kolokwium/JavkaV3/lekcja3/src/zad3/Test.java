package zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    static void main(String[] args) {
        Product p1 = new Product(5, "XD", 20.20);
        Product p2 = new Product(2, "XD", 19.20);
        ArrayList<Product> list = new ArrayList<>(Arrays.asList(p1 ,p2));
        MyComparator com = new MyComparator();
        Collections.sort(list, com);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
