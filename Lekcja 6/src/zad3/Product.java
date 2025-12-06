package zad3;

public abstract class Product {
    double price;
    public Product(double price) {
        this.price = price;
    }

    public abstract double getPrice();
}
