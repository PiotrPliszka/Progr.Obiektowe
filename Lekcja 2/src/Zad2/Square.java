package Zad2;

public class Square {

    int side;

    public Square() {
        this(1);
    }

    public Square(int num) {
        this.side = num;
    }

    public int pole() {
        return side * side;
    }
}