# 📚 Programowanie Obiektowe – Zadania

## Spis treści

### Lekcja 1
- Zadanie 1 – Minimum  
- Zadanie 2 – Średnia  
- Zadanie 3 – Piramida znaków  

### Lekcja 2
- Zadanie 1 – Klasa Time  
- Zadanie 2 – Klasa Dog  
- Zadanie 3 – Klasa Employee  

### Lekcja 3
- Zadanie 1 – Klasa Vehicle  
- Zadanie 2 – Klasa Results  
- Zadanie 3 – Klasa Mathematics  

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

### Zadanie 1 – Klasa Time
Klasa `Time` z polami `hours` i `minutes`.  
Metoda `addTime` dodaje czas i dba o poprawny zakres godzin/minut.

### Zadanie 2 – Klasa Dog
Klasa `Dog` z polami `name`, `breed` i `age`.  
Posiada dwa konstruktory – pełny i skrócony (wiek domyślny = 1).

### Zadanie 3 – Klasa Employee
Klasa `Employee` z polami prywatnymi i metodą `showInformation()`.  
Zawiera konstruktor, gettery i settery.

---

## Lekcja 3

### Zadanie 1 – Klasa Vehicle
Klasa `Vehicle` z polami `brand`, `model`, `yearOfProduction`.  
Konstruktor waliduje dane, klasa ma `toString()`, `equals()` i `hashCode()`.

### Zadanie 2 – Klasa Results
Klasa `Results` z polami `firstName`, `lastName` i tablicą `results`.  
Zawiera metody dodawania wyniku, obliczania średniej i standardowe metody obiektowe.

### Zadanie 3 – Klasa Mathematics
Klasa `Mathematics` z niemodyfikowalnym polem statycznym `PI`.  
Przygotuj prosty test wykorzystujący to pole.

---

## Lekcja 4

### Zadanie 1 – Klasa Person i Employee
Utwórz klasę `Person` z prywatnym polem `firstName` i chronionym `lastName`.  
Klasa `Employee` dziedziczy po `Person`. Sprawdź dostępność pól i dodaj gettery.  
W metodzie `displayData()` wypisz dane pracownika przez gettery.

---

### Zadanie 2 – Klasa Tool i Hammer
Stwórz klasę `Tool` z chronionym konstruktorem przyjmującym nazwę.  
Klasa `Hammer` dziedziczy po `Tool` i wywołuje konstruktor bazowy przez `super()`.  
Zastanów się, dlaczego konstruktor `private` uniemożliwiłby dziedziczenie.

---

### Zadanie 3 – Pakiety i pola chronione
Utwórz pakiety `animals` i `mammals`.  
W `animals` – klasa `Animal` z polem chronionym `species` i prywatnym `age`.  
W `mammals` – klasa `Dog` dziedziczy po `Animal`.  
Sprawdź, które pola są dostępne w klasie z innego pakietu.

---

### Zadanie 4 – Nadpisywanie metod i `super`
Klasa `Vehicle` z metodą `drive()` wypisującą „The vehicle is moving.”  
Klasa `Car` nadpisuje metodę, a następnie wywołuje oryginał przez `super.drive()`.

---

### Zadanie 5 – Przeciążanie metod
Klasa `Calculator` z metodą `add(int, int)`.  
Klasa `ExtendedCalculator` ma metodę `add(int, int, int)`.  
Zastanów się, czy to nadpisanie, czy przeciążenie metody.

---

### Zadanie 6 – Metody statyczne
Klasa `Base` ma statyczną metodę `info()`.  
Klasa `Child` definiuje metodę `info()` o tej samej nazwie.  
Porównaj zachowanie i wyjaśnij różnicę między ukrywaniem a nadpisywaniem metod statycznych.

---

### Zadanie 7 – Dziedziczenie konstruktorów
Klasa `Animal` z polem `name` i konstruktorem ustawiającym wartość „Unknown”.  
Klasa `Dog` dziedziczy po `Animal` bez własnego konstruktora.  
Sprawdź wynik przy tworzeniu nowego obiektu i użyciu `getClass().getName()`.

---

### Zadanie 8 – Klasy Computer, Laptop i Desktop
Klasa `Computer` z polami `manufacturer`, `model`, `partsPrices`.  
Klasy `Laptop` (pole `weight`) i `Desktop` (pole `caseType`) dziedziczą po `Computer`.  
Dodaj konstruktory, gettery/settery oraz metody `toString()`, `equals()` i `hashCode()`.  
Napisz krótki program testujący.
