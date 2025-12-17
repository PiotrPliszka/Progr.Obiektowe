package zad0;

public class Main {
    public static void main(String[] args) {
        // 1. Tworzenie obiektów wewnątrz metody main
        Animal kot = new Animal("Filemon");
        Box<Animal> pudelko = new Box<>(kot);

        // 2. Wywołanie metody.
        // Używamy gettera (pudelko.getObiekt()), zamiast pola (pudelko.obiekt)
        // chociaż w tym samym pakiecie oba sposoby by zadziałały, getter jest bezpieczniejszy.
        pudelko.getObiekt().dajGlos();
    }
}