package zad6;

public class PressureSensor implements Sensor{
    public double pressure = 1018.4;
    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return "Sensor działa, ciśnienie wynosi: " + pressure;
    }

    @Override
    public void reset() {
        System.out.println("Reset sensoru");
    }
}
