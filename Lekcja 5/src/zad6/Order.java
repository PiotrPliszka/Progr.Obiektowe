package zad6;

public record Order(Product[] products) {
    public double totalValue(){
        double total = 0;
        for (Product price: products){
            total += price.price();
        }
        return total;
    }
    public String nameProduct(){
        String txt = "";
        for (Product name: products){
            txt += (name.name() + " ");
        }
        return txt;
    }
}