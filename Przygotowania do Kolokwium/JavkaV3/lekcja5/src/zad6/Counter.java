package zad6;

import java.util.ArrayList;

public class Counter<T>{
    public ArrayList<T> list;
    public T element;

    public Counter(T element) {
        this.list = new ArrayList<>();
        this.element = element;
    }

    public Counter(){
        this.list = new ArrayList<>();
    }

    public void add(T element){
        list.add(element);
    }

    public int getCount(){
        return list.size();
    }

    static void main(String[] args) {
        String napis = "123";
        String napis2 = "xDdd";
        Counter counter = new Counter();
        counter.add(napis);
        counter.add(napis2);
        System.out.println(counter.getCount());
    }
}
