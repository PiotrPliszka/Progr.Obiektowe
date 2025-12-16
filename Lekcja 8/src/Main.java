import zad1.*;
import zad2.*;
void main() {
//    ZAD1
    Teacher originalTeacher = new Teacher("Jan Kowalski", "Matematyka", 10);

    // Krok 4: Klonujemy obiekt
    Teacher clonedTeacher = originalTeacher.clone();

    // Wyświetlamy stan przed zmianą
    System.out.println("--- PRZED ZMIANĄ ---");
    System.out.println("Oryginał: " + originalTeacher);
    System.out.println("Klon:     " + clonedTeacher);

    // Krok 5: Zmieniamy doświadczenie TYLKO w oryginale
    originalTeacher.experience = 20;

    // Krok 6: Wyświetlamy oba obiekty, aby sprawdzić niezależność
    System.out.println("\n--- PO ZMIANIE DOŚWIADCZENIA ORYGINAŁU ---");
    System.out.println("Oryginał: " + originalTeacher);
    System.out.println("Klon:     " + clonedTeacher);

    //    ZAD2
    ArrayList<Integer> li = new ArrayList<>();
    li.add(90);
    li.add(120);
    li.add(180);
    Athlete atleta = new Athlete("Dawid", li);
    Athlete sklonowanyatleta = atleta.clone();

    System.out.println(atleta);
    System.out.println(sklonowanyatleta);
    li.add(240);
    System.out.println(atleta);
    System.out.println(sklonowanyatleta);
}
