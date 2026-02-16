package zad2;

import java.util.ArrayList;

public class Counter<T>{
    public ArrayList<T> elements;
    public T element;

    public Counter(T element) {
        this.elements = new ArrayList<>();
        this.element = element;
    }

    public Counter() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public int getCount(){
        return elements.size();
    }

    static void main(String[] args) {
        String napis="Napisik";
        String liczba="123";
        Counter<String> licznik= new Counter<>();
        licznik.add(napis);
        System.out.println(licznik.getCount());
    }
}
