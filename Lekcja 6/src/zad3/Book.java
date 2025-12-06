package zad3;

public class Book extends Product{
    public Book(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
