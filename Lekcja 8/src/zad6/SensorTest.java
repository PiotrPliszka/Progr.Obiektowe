package zad6;

public class SensorTest {
    static void main(String[] args) {
        TemperatureSensor t1 = new TemperatureSensor();
        System.out.println(t1.getStatus());
        System.out.println(t1.readValue());
        t1.reset();
    }
}
