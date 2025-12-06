package zad3;

import java.util.ArrayList;

public class TestProduct{

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Clothing(29.99));
        products.add(new Clothing(29.99));
        products.add(new Book(49.99));
        products.add(new Book(49.99));
        products.add(new Book(49.99));
        products.add(new Book(49.99));

        for (Product p : products) {
            System.out.println("Cena: " + p.getPrice());
        }
    }
}
