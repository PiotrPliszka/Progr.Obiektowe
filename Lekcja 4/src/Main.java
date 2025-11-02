//import Zad1.*;
//import Zad2.*;
//import Zad2.animals.Animals;
//import Zad2.mammals.Dog;
//import Zad3.*;
//import Zad5.*;
//import Zad5.Base;
//import Zad5.Child;
import Zad6.*;

void main(String[] args) {
//    ZAD1
//    Tool t1 = new Tool("Młotek");

//    ZAD2
//    Animals a1 = new Animals("Burek", 21);
//    Dog d1 = new Dog("Azor", 22);
//    System.out.println(a1.species);

//    ZAD3
//    Car c1 = new Car();
//    c1.drive();

//    ZAD5
//    Base b1 = new Base();
//    Child c1 = new Child();
//    Base ref = new Child();


//    b1.info();
//    c1.info();
//    ref.info();

//    ZAD6
    Animal a1 = new Animal("Dog");
    Animal a2 = new Animal();
    Dog d1 = new Dog();
    System.out.println(d1.name);
    System.out.println(d1.getClass().getName());
}
