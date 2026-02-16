package zad7;

public class Triple<T, U, V> {
    public T first;
    public U second;
    public V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }

    static void main(String[] args) {
        Triple triple = new Triple("Napis", "XD", "DD");
        System.out.println(triple.getFirst());

    }
}
