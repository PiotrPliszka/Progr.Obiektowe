import  zad2.*;
import zad3.Triple;

void main(String[] args) {
//    ZAD2
    Counter<Integer> c = new Counter<>();
    c.add(1);
    c.add(2);
    c.add(3);
    c.add(4);
    c.add(5);
    c.add(6);

    System.out.println(c.getCount());

//    ZAD3
    Triple<String, Integer, Double> student = new Triple<>("Adam", 21, 4.5);

    System.out.println("Student: " + student.getFirst());
    System.out.println("Wiek: " + student.getSecond());
    System.out.println("Średnia: " + student.getThird());

//    ZAD4

}