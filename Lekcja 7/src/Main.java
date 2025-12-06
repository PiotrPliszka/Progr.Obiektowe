import zad1.*;
import zad2.*;
import zad3.*;
import zad4.Product;
import zad4.*;
import zad5.Person;
import zad5.*;
import zad6.*;


void main(String[] args) {
//    ZAD1
    ArrayList<Employee> pracownicy = new ArrayList<>();

    pracownicy.add(new Employee("Piotr", 1540, LocalDate.of(2025, 03, 20)));
    pracownicy.add(new Employee("Dawid", 10.12, LocalDate.of(2025, 02, 20)));
    pracownicy.add(new Employee("Bartek", 12, LocalDate.of(2025, 03, 20)));
    Collections.sort(pracownicy);
    for (Employee e: pracownicy){
        System.out.println(e);
    }
    System.out.println();
//    Zad2
    ArrayList<Client> clients = new ArrayList<>();
    clients.add(new Client("Piotr", 123123123, LocalDate.of(2021, 03, 20)));
    clients.add(new Client("Dawid", 123123123, LocalDate.of(2024, 03, 20)));
    clients.add(new Client("Bartek", 123123123, LocalDate.of(2023, 03, 20)));
    Collections.sort(clients);

    for (Client c: clients){
        System.out.println(c);
    }
    System.out.println();

//    ZAD3
    ArrayList<Book> ksiazka = new ArrayList<>();
    ksiazka.add(new Book("Biblia", 4000, LocalDate.of(2000, 03, 12)));
    ksiazka.add(new Book("Ogniem i Mieczem", 200, LocalDate.of(2000, 03, 12)));
    ksiazka.add(new Book("Potop", 500, LocalDate.of(2000, 03, 12)));

    Collections.sort(ksiazka);
    for(Book b: ksiazka){
        System.out.println(b);
    }
    System.out.println();
//    ZAD4
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product(3, "Laptop", 2500.0));
    products.add(new Product(1, "Smartphone", 1200.0));
    products.add(new Product(5, "Monitor", 1200.0));
    products.add(new Product(2, "Keyboard", 150.0));
    products.add(new Product(4, "Mouse", 150.0));

    Collections.sort(products, new ProductPriceComparator());

    for (Product p : products) {
        System.out.println(p);
    }
    System.out.println();

//    ZAD5
    ArrayList<Person> osoby = new ArrayList<>();
    osoby.add(new Person("Piotr", "Pliszka", LocalDate.of(2004, 3, 20)));
    osoby.add(new Person("Amelia", "Piszka", LocalDate.of(2004, 9, 20)));

    Collections.sort(osoby, new PersonLastNameComparator());

    for (Person p: osoby){
        System.out.println(p);
    }
    System.out.println();

//    ZAD6
    ArrayList<Song> piosenki = new ArrayList<>();

    piosenki.add(new Song("Yesterday", "The Beatles", 125));
    piosenki.add(new Song("Bohemian Rhapsody", "Queen", 354));
    piosenki.add(new Song("Imagine", "John Lennon", 183));
    piosenki.add(new Song("Let It Be", "The Beatles", 243));
    piosenki.add(new Song("Hey Jude", "The Beatles", 243));

    Comparator<Song> combinedComparator = new DurationComparator().thenComparing(new ArtistTitleComparator());
    Collections.sort(piosenki, combinedComparator);

    for (Song song : piosenki) {
        System.out.println(song);
    }
}