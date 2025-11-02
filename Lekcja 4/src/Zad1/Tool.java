package Zad1;

public class Tool {
    String name;

    protected Tool(String name) {
        this.name = name;
    }

    static void main() {
        Tool t1 = new Tool("Łom");
        Hammer h1 = new Hammer("Młotek");
    }
}