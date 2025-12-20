package zad6;

public class TemperatureSensor implements Sensor{
    private double temp = 35.5;
    @Override
    public double readValue() {
        return temp;
    }

    @Override
    public String getStatus() {
        return "Sensor sprawny temperatura: " + temp;
    }

    @Override
    public void reset() {
        System.out.println("Reset sensoru");
    }
}
