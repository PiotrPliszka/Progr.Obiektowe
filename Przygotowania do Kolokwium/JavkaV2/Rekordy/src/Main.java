import zad1.*;
import zad2.Address;
import zad2.Person;
import zad3.PointC;
import zad3.PointR;
import zad4.Student;
import zad6.Order;
import zad6.Prodcut;


void main() {
//    ZAD1
    BookDTO b1 = new BookDTO("Ogniem", "XD", 50.48, 2000);
    System.out.println(b1);

//    ZAD2
    Address a1 = new Address("Kwiatowa", 79, "07-430", "Myszyniec");
    Person p1 = new Person("Piotr", "Pliszka", a1);
    System.out.println(p1);

//    ZAD3
    PointC po1 = new PointC(5, 10);
    PointR r1 = new PointR(11, 12);
    PointR r2 = po1.toRecord();
    System.out.println(r2.getClass());
    System.out.println(r1.toClass().getClass());

//    ZAD4
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(5);
    lista.add(5);
    lista.add(2);
    Student s1 = new Student("Piotr", "Pliszka", lista);
    System.out.println(s1.averageGrades());

//    ZAD6
    Prodcut p11 = new Prodcut("Myszka", 120.50);
    Prodcut p2 = new Prodcut("Klawiatura", 220.50);
    Order o1 = new Order(new ArrayList<Prodcut>(Arrays.asList(p11, p2)));
    o1.totalValue();

}


