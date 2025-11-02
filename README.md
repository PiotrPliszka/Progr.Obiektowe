# 📚 Programowanie Obiektowe – Zadania

## Spis treści

### Lekcja 1
- Zadanie 1 – Minimum  
- Zadanie 2 – Średnia  
- Zadanie 3 – Piramida znaków  

### Lekcja 2
- Zadanie 1 – Klasa Book  
- Zadanie 2 – Klasa Square  
- Zadanie 3 – Klasa Point  
- Zadanie 4 – Klasa Car  
- Zadanie 5 – Klasa Time  
- Zadanie 6 – Klasa Dog  
- Zadanie 7 – Klasa Employee  

### Lekcja 3
- Zadanie 1 – Klasa Person  
- Zadanie 2 – Klasa Vehicle  
- Zadanie 3 – Klasa Results  
- Zadanie 4 – Klasa Mathematics  

### Lekcja 4
- Zadanie 1 – Klasa Person i Employee  
- Zadanie 2 – Klasa Tool i Hammer  
- Zadanie 3 – Pakiety i pola chronione  
- Zadanie 4 – Nadpisywanie metod i `super`  
- Zadanie 5 – Przeciążanie metod  
- Zadanie 6 – Metody statyczne  
- Zadanie 7 – Dziedziczenie konstruktorów  
- Zadanie 8 – Klasy Computer, Laptop i Desktop  

---

## Lekcja 1

### Zadanie 1 – Minimum
Napisz metodę zwracającą najmniejszą liczbę z listy liczb całkowitych.

### Zadanie 2 – Średnia
Napisz metodę obliczającą średnią z listy liczb zmiennoprzecinkowych.  
Dla pustej listy zwróć `0`.

### Zadanie 3 – Piramida znaków
Program pobiera znak i liczbę `n`, a następnie tworzy piramidę tekstową o wysokości `n`.

---

## Lekcja 2

### Zadanie 1 – Klasa Book
Napisz klasę `Book`, która zawiera pola: `title`, `author`, `publicationYear`.  
Dodaj dwa konstruktory:
- domyślny (bez argumentów),
- drugi, przyjmujący trzy argumenty o takich samych nazwach jak pola klasy.  

W konstruktorze z argumentami użyj słowa kluczowego `this`, aby przypisać wartości do pól.  
Sprawdź, czy przypisanie działa poprawnie w przypadku tworzenia obiektu.


### Zadanie 2 – Klasa Square
Zaprojektuj klasę `Square` z polem `side` i konstruktorem przyjmującym jego wartość.  
Dodaj drugi konstruktor bezargumentowy, który wywołuje pierwszy z wartością domyślną `1`.  
Dodaj metodę `getArea()`, która zwraca pole powierzchni kwadratu.


### Zadanie 3 – Klasa Point
Utwórz klasę `Point` z polami `x` i `y`, reprezentującymi współrzędne punktu.  
Dodaj metodę `distance(Point otherPoint)`, która oblicza odległość między bieżącym punktem a innym punktem.  
Stwórz przypadek testowy, w którym metoda zostanie wywołana co najmniej raz.


### Zadanie 4 – Klasa Car
Utwórz klasę `Car` z prywatną metodą `engineFailure()`.  
Spróbuj wywołać tę metodę z zewnątrz klasy i sprawdź, czy kompilator na to pozwoli.


### Zadanie 5 – Klasa Time
Stwórz klasę `Time` z polami `hours` i `minutes`.  
Dodaj metodę `addTime(Time otherTime)`, która dodaje czas z innego obiektu i zwraca nowy obiekt `Time`.  
Zadbaj o to, aby:
- minuty nie przekraczały `59`,  
- godziny nie przekraczały `23`.  
Przygotuj przypadek testowy, w którym metoda zostanie wywołana.


### Zadanie 6 – Klasa Dog
Utwórz klasę `Dog` z polami `name`, `breed` i `age`.  
Dodaj dwa konstruktory:
- pierwszy przyjmujący wszystkie trzy argumenty,  
- drugi przyjmujący tylko `name` i `breed`, który wywołuje pierwszy konstruktor z domyślnym wiekiem `1`.


### Zadanie 7 – Klasa Employee
Utwórz klasę `Employee` z prywatnymi polami: `firstName`, `lastName`, `position`, `age`, `salary`.  
Dodaj konstruktor przyjmujący wszystkie pola, gettery i settery.  
Dodaj metodę `showInformation()`, która wypisuje informacje o pracowniku.

---

## Lekcja 3

### Zadanie 1 – Klasa Person
Zdefiniuj klasę `Person` z polami `firstName`, `lastName` i `age`.  
Konstruktor przyjmuje trzy argumenty i waliduje dane:
- `age` nie może być ujemny (w przeciwnym razie ustaw `0`),  
- `firstName` i `lastName` nie mogą być `null` ani puste (w przeciwnym razie ustaw pusty napis).  

Dodaj metody:
- `toString()` – zwraca `"Person: [firstName] [lastName], Age: [age]."`,  
- `equals()` i `hashCode()` – porównują obiekty na podstawie wszystkich pól.


### Zadanie 2 – Klasa Vehicle
Zdefiniuj klasę `Vehicle` z polami `brand`, `model` i `yearOfProduction`.  
Konstruktor waliduje dane:
- `yearOfProduction` nie może być większy niż aktualny rok (w przeciwnym razie ustaw aktualny rok),  
- `brand` i `model` nie mogą być `null` ani puste (w przeciwnym razie ustaw pusty napis).  

Dodaj metody:
- `toString()` – `"Vehicle: [brand] [model], Year: [yearOfProduction]."`,  
- `equals()` i `hashCode()` – porównują obiekty po wszystkich polach.


### Zadanie 3 – Klasa Results
Stwórz klasę `Results` z prywatnymi polami `firstName`, `lastName` i tablicą `results` (typ `int[]`).  
Konstruktor przyjmuje imię, nazwisko i rozmiar tablicy.  
Dodaj:
- gettery i settery,  
- metodę `addResult(int index, int result)`,  
- metodę `averageResult()` – zwracającą średnią z wyników.  

Metody:
- `toString()` – `"Results for [firstName] [lastName]: Average Score = [average], Results: [r1, r2, ...]."`,  
- `equals()` i `hashCode()` – porównują wszystkie pola i zawartość tablicy.


### Zadanie 4 – Klasa Mathematics
Stwórz klasę `Mathematics` z polem statycznym `PI`, przechowującym przybliżoną wartość liczby π.  
Pole powinno być **niemodyfikowalne** (`final`).  
Przygotuj prosty przypadek testowy demonstrujący użycie tego pola.

---

## Lekcja 4

### Zadanie 1 – Klasa Person i Employee
Utwórz klasę `Person` z prywatnym polem `firstName` i chronionym `lastName`.  
Klasa `Employee` dziedziczy po `Person`. Sprawdź dostępność pól i dodaj gettery.  
W metodzie `displayData()` wypisz dane pracownika przez gettery.


### Zadanie 2 – Klasa Tool i Hammer
Stwórz klasę `Tool` z chronionym konstruktorem przyjmującym nazwę.  
Klasa `Hammer` dziedziczy po `Tool` i wywołuje konstruktor bazowy przez `super()`.  
Zastanów się, dlaczego konstruktor `private` uniemożliwiłby dziedziczenie.


### Zadanie 3 – Pakiety i pola chronione
Utwórz pakiety `animals` i `mammals`.  
W `animals` – klasa `Animal` z polem chronionym `species` i prywatnym `age`.  
W `mammals` – klasa `Dog` dziedziczy po `Animal`.  
Sprawdź, które pola są dostępne w klasie z innego pakietu.


### Zadanie 4 – Nadpisywanie metod i `super`
Klasa `Vehicle` z metodą `drive()` wypisującą „The vehicle is moving.”  
Klasa `Car` nadpisuje metodę, a następnie wywołuje oryginał przez `super.drive()`.


### Zadanie 5 – Przeciążanie metod
Klasa `Calculator` z metodą `add(int, int)`.  
Klasa `ExtendedCalculator` ma metodę `add(int, int, int)`.  
Zastanów się, czy to nadpisanie, czy przeciążenie metody.


### Zadanie 6 – Metody statyczne
Klasa `Base` ma statyczną metodę `info()`.  
Klasa `Child` definiuje metodę `info()` o tej samej nazwie.  
Porównaj zachowanie i wyjaśnij różnicę między ukrywaniem a nadpisywaniem metod statycznych.


### Zadanie 7 – Dziedziczenie konstruktorów
Klasa `Animal` z polem `name` i konstruktorem ustawiającym wartość „Unknown”.  
Klasa `Dog` dziedziczy po `Animal` bez własnego konstruktora.  
Sprawdź wynik przy tworzeniu nowego obiektu i użyciu `getClass().getName()`.


### Zadanie 8 – Klasy Computer, Laptop i Desktop
Klasa `Computer` z polami `manufacturer`, `model`, `partsPrices`.  
Klasy `Laptop` (pole `weight`) i `Desktop` (pole `caseType`) dziedziczą po `Computer`.  
Dodaj konstruktory, gettery/settery oraz metody `toString()`, `equals()` i `hashCode()`.  
Napisz krótki program testujący.

---

