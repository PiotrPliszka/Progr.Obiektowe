package zad2;

public class Laptop extends ElectronicDevice{

    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop off");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop on");
    }
}
