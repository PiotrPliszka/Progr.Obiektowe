import zad1.*;
import zad2.*;
import zad3.*;
import zad4.*;
import zad5.*;
import zad6.*;

void main() {
//    ZAD1
    BookDTO b1 = new BookDTO("Olsztyn", "Bartosz Rossmanowski", 100, 2025);
    System.out.println(b1);
//    ZAD2
    Address a1 = new Address("Kolejowa", 80, "07-430", "Myszyniec");
    Person p1 = new Person("Piotr", "Pliszka", a1);
    System.out.println(p1);
//    ZAD3
    PointC c1 = new PointC(5, 10);
    PointR r1 = new PointR(3, 14);
    System.out.println(c1.toRecord());
    System.out.println(r1.toClass());
//    ZAD4
    ArrayList<Integer> li = new ArrayList<Integer>();
    li.add(5);
    li.add(2);
    li.add(5);
    Student s1 = new Student("Piotr", "Pliszka", li);
    System.out.println(s1);
    System.out.println(s1.averageGrades());
//    ZAD5
    BankAccount bank1 = new BankAccount("111222333444", 20);
    BankAccount bank2 = new BankAccount("111222333444");
    System.out.println(bank1);
    System.out.println(bank2);
//    ZAD6
    Product pro1 = new Product("Ołówek", 20);
    Product pro2 = new Product("Długopis", 80);
    Order or1 = new Order(new Product[]{ pro1, pro2 });
    System.out.println(or1);
    System.out.println(or1.totalValue());
    System.out.println(or1.nameProduct());
    System.out.println(pro1);


}
