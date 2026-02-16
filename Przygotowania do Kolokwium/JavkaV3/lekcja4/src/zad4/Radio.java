package zad4;

public class Radio implements MusicPlayer{
    @Override
    public void turnOn() {
        System.out.println("Właczono");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłaczono");
    }
}
