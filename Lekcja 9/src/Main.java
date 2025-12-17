import  zad2.*;

void main(String[] args) {
    Counter<Integer> c = new Counter<>();
    c.add(1);
    c.add(2);
    c.add(3);
    c.add(4);
    c.add(5);
    c.add(6);

    System.out.println(c.getCount());
}