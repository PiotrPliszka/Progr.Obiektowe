package zad4;

import java.util.ArrayList;

public class Counter<T>{
    public ArrayList<T> list;
    public T element;

    public Counter(T element) {
        this.list = new ArrayList<T>();
        this.element = element;
    }
    public Counter() {
        this.list = new ArrayList<>();
    }
    public void add(T element){
        list.add(element);
    }
    public int getCount(){
        return list.size();
    }

    static void main(String[] args) {
        String napis1 = "XDD";
        String napis2 = "123";
        Counter c1 = new Counter();
        c1.add(napis1);
        System.out.println(c1.getCount());
    }
}
