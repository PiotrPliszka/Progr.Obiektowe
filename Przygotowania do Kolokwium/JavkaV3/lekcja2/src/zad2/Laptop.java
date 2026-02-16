package zad2;

public class Laptop extends ElectronicDevice{
    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    void turnOff() {
        System.out.println("Właczam laptop");
    }

    @Override
    void turnOn() {
        System.out.println("off laptop");
    }
}
