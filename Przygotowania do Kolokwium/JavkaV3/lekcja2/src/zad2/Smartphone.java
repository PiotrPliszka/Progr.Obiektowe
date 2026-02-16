package zad2;

public class Smartphone extends ElectronicDevice{
    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    void turnOff() {
        System.out.println("Wyłaczam telefon");
    }

    @Override
    void turnOn() {
        System.out.println("Właczam teelfon");
    }
}
