package zad3;

import zad1.MyClass;

public class isEqual<T, U> {
    public T first;
    public U second;

    public isEqual(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public boolean xd(){
        return this.first.equals(this.second);
    }

    static void main(String[] args) {
        String napis1 = "XD";
        String napis2 = "XD";

        MyClass c1 = new MyClass();
        MyClass c2 = new MyClass();

        isEqual e = new isEqual(napis1, napis2);
        System.out.println(e.xd());
    }
}
