package zad0;

public class Box <T> {
    T obiekt;

    public Box(T obiekt){
        this.obiekt = obiekt;
    }

    public void setObiekt(T obiekt) {
        this.obiekt = obiekt;
    }

    public T getObiekt() {
        return obiekt;
    }
}
