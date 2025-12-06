package zad3;

public class Clothing extends Product{
    public Clothing(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
