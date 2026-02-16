import zad1.*;
import zad2.*;
import zad3.TestMyComparator;
import zad4.Radio;

void main() {
//    ZAD1
    Teacher t1 = new Teacher("XD", "PL", 10);
    Teacher t2 = t1.clone();
    t2.experience = 20;
    System.out.println(t1);
    System.out.println(t2);

//    Zad2
    Athlete a1 = new Athlete("Pioter", new ArrayList<Integer>(Arrays.asList(10, 20, 30)));
    Athlete a2 = a1.clone();
    a2.lapTimesp.add(40);
    System.out.println(a1);
    System.out.println(a2);
    TestMyComparator comparator = new TestMyComparator();
    System.out.println(comparator.compare(5, 10));

//    ZAD3
    Radio r1 = new Radio();
    r1.turnOn();
    r1.turnOff();

}

