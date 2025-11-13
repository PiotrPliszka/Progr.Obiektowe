package zad6;

public record Product(String name, double price) {
    public Product{
        if(price < 0){
            price = 0;
        }
    }
}