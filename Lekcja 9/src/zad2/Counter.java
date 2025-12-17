package zad2;

import java.util.ArrayList;

public class Counter <T>{
    ArrayList<T> lista;
    public int licznik = 0;

    public Counter(){
        lista = new ArrayList<T>();
    }

    public void add(T object){
        lista.add(object);
        count();
    }

    public void count(){
        licznik++;
    }

    public int getCount(){
        return licznik;
    }

}
