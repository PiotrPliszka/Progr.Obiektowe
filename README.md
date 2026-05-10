# ☕ Programowanie Obiektowe – Zadania

![Java](https://img.shields.io/badge/Java-OOP-ED8B00?logo=openjdk&logoColor=white)
![UWM](https://img.shields.io/badge/UWM-Coursework-4B8BBE)
![Status](https://img.shields.io/badge/Status-Completed-2E8B57)

> Repozytorium zawiera rozwiązania zadań laboratoryjnych z przedmiotu **Programowanie Obiektowe** realizowanego na UWM.
> Implementacje w Javie — od podstaw klas i dziedziczenia, przez rekordy i klasy abstrakcyjne, aż po interfejsy, generyki i obsługę wyjątków.

---

## 📦 Zakres materiału

| Lekcja | Temat |
|--------|-------|
| Lekcja 1 | Wprowadzenie — metody, pętle, operacje na danych |
| Lekcja 2 | Klasy, konstruktory, pola prywatne, `this` |
| Lekcja 3 | `toString()`, `equals()`, `hashCode()`, walidacja danych |
| Lekcja 4 | Dziedziczenie, `super`, pakiety, metody statyczne |
| Lekcja 5 | Rekordy (`record`) — DTO, zagnieżdżone rekordy, konstruktory |
| Lekcja 6 | Klasy abstrakcyjne, polimorfizm, pakiety |
| Lekcja 7 | `Comparable`, `Comparator`, sortowanie obiektów |
| Lekcja 8 | `Cloneable`, interfejsy własne i wbudowane |
| Lekcja 9 | Wyjątki, generyki (`<T>`, `<T,U,V>`, `Comparable<T>`) |

---

## 📁 Struktura repozytorium

```text
Progr.Obiektowe/
├── Lekcja 1/
├── Lekcja 2/
├── Lekcja 3/
├── Lekcja 4/
├── Lekcja 5/
├── Lekcja 6/
├── Lekcja 7/
├── Lekcja 8/
├── Lekcja 9/
└── Przygotowania do Kolokwium/
```

---

## 📝 Szczegółowy spis zadań

### Lekcja 1 – Wprowadzenie

Podstawowe metody, pętle i operacje na danych.

- Zadanie 1 – Metoda zwracająca minimum z listy liczb całkowitych
- Zadanie 2 – Metoda obliczająca średnią z listy liczb zmiennoprzecinkowych
- Zadanie 3 – Piramida znaków na podstawie wejścia użytkownika

---

### Lekcja 2 – Klasy i Konstruktory

Projektowanie klas z polami, konstruktorami i metodami.

- Zadanie 1 – `Book` — dwa konstruktory, słowo kluczowe `this`
- Zadanie 2 – `Square` — konstruktor bezargumentowy wywołujący drugi przez `this()`
- Zadanie 3 – `Point` — metoda `distance(Point other)`
- Zadanie 4 – `Car` — prywatna metoda, weryfikacja dostępu z zewnątrz
- Zadanie 5 – `Time` — dodawanie czasu z kontrolą zakresu (minuty ≤ 59, godziny ≤ 23)
- Zadanie 6 – `Dog` — konstruktor z domyślnym wiekiem przez `this()`
- Zadanie 7 – `Employee` — pola prywatne, gettery/settery, `showInformation()`

---

### Lekcja 3 – `toString`, `equals`, `hashCode`

Poprawne nadpisywanie metod bazowych i walidacja danych w konstruktorach.

- Zadanie 1 – `Person` — walidacja wieku i imion, `equals` i `hashCode`
- Zadanie 2 – `Vehicle` — walidacja roku produkcji względem bieżącego roku
- Zadanie 3 – `Results` — tablica wyników, `averageResult()`, `equals` i `hashCode` z porównaniem tablic
- Zadanie 4 – `Mathematics` — pole statyczne `final PI`

---

### Lekcja 4 – Dziedziczenie

Modyfikatory dostępu, `super`, pakiety, nadpisywanie i ukrywanie metod.

- Zadanie 1 – `Person` i `Employee` — pola `private` vs `protected`, gettery
- Zadanie 2 – `Tool` i `Hammer` — chroniony konstruktor, wywołanie `super()`
- Zadanie 3 – Pakiety `animals` i `mammals` — dostępność pól chronionych między pakietami
- Zadanie 4 – `Vehicle` i `Car` — nadpisywanie metody, `super.drive()`
- Zadanie 5 – `Calculator` i `ExtendedCalculator` — przeciążanie vs nadpisywanie
- Zadanie 6 – `Base` i `Child` — ukrywanie metod statycznych vs ich nadpisywanie
- Zadanie 7 – `Animal` i `Dog` — dziedziczenie konstruktorów, `getClass().getName()`
- Zadanie 8 – `Computer`, `Laptop`, `Desktop` — hierarchia klas, `toString`, `equals`, `hashCode`

---

### Lekcja 5 – Rekordy (`record`)

Niemutowalne struktury danych, konwersje między klasą a rekordem.

- Zadanie 1 – `BookDTO` — podstawowy rekord z polami `title`, `author`, `price`, `yearOfPublication`
- Zadanie 2 – `Address` i `Person` — zagnieżdżone rekordy
- Zadanie 3 – `PointC` (klasa) i `PointR` (rekord) — metody konwersji w obu kierunkach
- Zadanie 4 – `Student` — rekord z metodą `averageGrades()`
- Zadanie 5 – `BankAccount` — rekord z konstruktorem ustawiającym domyślne saldo `0`
- Zadanie 6 – `Order` i `Product` — zagnieżdżone rekordy, metoda `totalValue()`

---

### Lekcja 6 – Klasy Abstrakcyjne

Polimorfizm, klasy abstrakcyjne, pakiety.

- Zadanie 1 – `ComputerGraphic` → `Bitmap`, `Vector` — `loadFile()`, `saveFile()`
- Zadanie 2 – `ElectronicDevice` → `Smartphone`, `Television`, `Laptop` — `turnOn()`, `turnOff()`
- Zadanie 3 – `Product` → `Book`, `Clothing` — pakiet `store`, `getPrice()`, iteracja przez tablicę
- Zadanie 4 – `Game` → `StrategyGame`, `AdventureGame` — pakiet `entertainment`, `getRating()`

---

### Lekcja 7 – `Comparable` i `Comparator`

Sortowanie obiektów według własnych kryteriów.

- Zadanie 1 – `Employee` + `Comparable` — sortowanie rosnąco po pensji
- Zadanie 2 – `Client` + `Comparable` — sortowanie malejąco po dacie ostatniego logowania
- Zadanie 3 – `Book` + `Comparable` — sortowanie malejąco po liczbie stron
- Zadanie 4 – `Product` + `Comparator` — sortowanie po cenie, przy równości po `id`
- Zadanie 5 – `Person` + `Comparator` — sortowanie po nazwisku, przy równości po imieniu
- Zadanie 6 – `Song` — dwa Comparatory: `DurationComparator` i `ArtistTitleComparator`

---

### Lekcja 8 – Interfejsy i `Cloneable`

Implementacja interfejsów wbudowanych i własnych, płytka vs głęboka kopia.

- Zadanie 1 – `Teacher` + `Cloneable` — klonowanie obiektu, weryfikacja niezależności kopii
- Zadanie 2 – `Athlete` + `Cloneable` — klonowanie listy `lapTimes`, płytka vs głęboka kopia
- Zadanie 3 – Własny interfejs `MyComparator` z metodą `compare(int a, int b): int`
- Zadanie 4 – Interfejs `MusicPlayer` → klasa `Radio`
- Zadanie 5 – Interfejs `Authentication` → `UserAuthentication`, `AdminAuthentication`
- Zadanie 6 – Interfejs `Sensor` → `TemperatureSensor`, `PressureSensor`

---

### Lekcja 9 – Wyjątki i Generyki

Własne wyjątki, obsługa błędów wejścia, klasy i metody generyczne.

- Zadanie 1 – Własny wyjątek `NiepoprawnyFormatDanychException`, walidacja formatu e-mail
- Zadanie 2 – Obsługa `ArithmeticException` i `InputMismatchException` przy dzieleniu
- Zadanie 3 – Generyczna metoda `isEqual<T>(T a, T b): boolean`
- Zadanie 4 – Generyczna klasa `Counter<T>` z metodami `add()` i `getCount()`
- Zadanie 5 – Generyczna klasa `Triple<T, U, V>` przechowująca trzy obiekty różnych typów
- Zadanie 6 – Generyczna metoda `max<T extends Comparable<T>>(T[] arr)` z obsługą pustej tablicy

---

## 👤 Autor

**Piotr Pliszka** — [GitHub](https://github.com/PiotrPliszka)
