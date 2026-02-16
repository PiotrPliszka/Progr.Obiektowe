package zad4;

public class Radio implements MusicPlayer{
    @Override
    public void turnOff() {
        System.out.println("Radio off");
    }

    @Override
    public void turnOn() {
        System.out.println("Radio on");
    }
}
