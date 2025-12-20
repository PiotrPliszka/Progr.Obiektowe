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

### Lekcja 5
- Zadanie 1 – Rekord BookDTO
- Zadanie 2 – Rekordy Address i Person
- Zadanie 3 – Konwersja Klasy PointC i Rekordu PointR
- Zadanie 4 – Rekord Student i średnia ocen
- Zadanie 5 – Rekord BankAccount i konstruktor
- Zadanie 6 – Rekordy Order i Product

### Lekcja 6
- Zadanie 1 – Klasa ComputerGraphic
- Zadanie 2 – Klasa ElectronicDevice
- Zadanie 3 – Klasa Product i pakiety
- Zadanie 4 – Klasa Game i pakiety

### Lekcja 7
- Zadanie 1 – Klasa Employee i Comparable
- Zadanie 2 – Klasa Client i Comparable
- Zadanie 3 – Klasa Book i Comparable
- Zadanie 4 – Klasa Product i Comparator
- Zadanie 5 – Klasa Person i Comparator
- Zadanie 6 – Klasa Song i wiele Comparatorów

### Lekcja 8
- Zadanie 1 – Klasa Teacher i Cloneable
- Zadanie 2 – Klasa Athlete i klonowanie listy
- Zadanie 3 – Interfejs MyComparator
- Zadanie 4 – Interfejs MusicPlayer
- Zadanie 5 – Interfejs Authentication
- Zadanie 6 – Interfejs Sensor

### Lekcja 9
- Zadanie 1 – Wyjątek NiepoprawnyFormatDanychException
- Zadanie 2 – Dzielenie i obsługa wyjątków
- Zadanie 3 – Generyczna metoda isEqual
- Zadanie 4 – Klasa generyczna Counter
- Zadanie 5 – Klasa generyczna Triple
- Zadanie 6 – Generyczna metoda max

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

## Lekcja 5

### Zadanie 1 – Rekord BookDTO
Stwórz rekord `BookDTO`, który reprezentuje książkę w sklepie internetowym. Powinien zawierać takie informacje jak `title`, `author`, `price` i `yearOfPublication`. Następnie stwórz kilka instancji tego rekordu, reprezentujących różne książki.

### Zadanie 2 – Rekordy Address i Person
Utwórz rekord `Address`, który zawiera `street`, `houseNumber`, `postalCode` i `city`. Następnie, stwórz rekord `Person`, który oprócz podstawowych informacji o osobie (np. `firstName`, `lastName`) zawiera również pole typu `Address`. Stwórz przypadek testowy.

### Zadanie 3 – Konwersja Klasy PointC i Rekordu PointR
Stwórz klasę `PointC` reprezentującą punkt na płaszczyźnie 2D z polami `x` i `y`. Następnie, stwórz rekord `PointR` z tymi samymi polami. Dodaj metody umożliwiające konwersję z instancji klasy na rekord i odwrotnie. Stwórz przypadek testowy.

### Zadanie 4 – Rekord Student i średnia ocen
Stwórz rekord `Student`, który reprezentuje imię, nazwisko i listę ocen ucznia. Wprowadź metodę `averageGrades()`, która oblicza średnią ocen ucznia. Stwórz przypadek testowy.

### Zadanie 5 – Rekord BankAccount i konstruktor
Stwórz rekord `BankAccount`, który zawiera numer konta oraz saldo. Dodaj konstruktor, który pozwala na tworzenie konta tylko z numerem, przy czym domyślne saldo wynosi `0`. Stwórz przypadek testowy.

### Zadanie 6 – Rekordy Order i Product
Stwórz rekord `Order`, który zawiera listę produktów. Każdy produkt reprezentowany jest przez rekord `Product` z nazwą i ceną. W rekordzie `Order` dodaj metodę `totalValue()`, która oblicza łączną wartość zamówienia na podstawie cen produktów. Stwórz przypadek testowy.

---

## Lekcja 6

### Zadanie 1 – Klasa ComputerGraphic
Zdefiniuj abstrakcyjną klasę `ComputerGraphic` z polami `width`, `height` (typu `int`) oraz `fileName` (typu `String`). Dodaj abstrakcyjne metody `loadFile()` i `saveFile()`.
Następnie zdefiniuj klasy `Bitmap` i `Vector`, które dziedziczą po klasie `ComputerGraphic` i implementują metody `loadFile()` oraz `saveFile()`.
Stwórz listę tablicową odpowiednich 5 obiektów i wywołaj dla nich napisane metody.

### Zadanie 2 – Klasa ElectronicDevice
Zdefiniuj abstrakcyjną klasę `ElectronicDevice` z polami `manufacturer` (typu `String`), `model` (typu `String`) oraz `productionYear` (typu `int`). Dodaj abstrakcyjne metody `turnOn()` i `turnOff()`.
Następnie zdefiniuj klasy `Smartphone`, `Television` i `Laptop`, które dziedziczą po klasie `ElectronicDevice` i implementują metody `turnOn()` oraz `turnOff()`.
Stwórz listę tablicową odpowiednich 5 obiektów i wywołaj dla nich napisane metody.

### Zadanie 3 – Klasa Product i pakiety
W jednym projekcie wykonaj następujące czynności:
1.  Stwórz abstrakcyjną klasę `Product` zawierającą publiczną abstrakcyjną metodę `getPrice()`, która nie przyjmuje argumentów i zwraca `double`. Klasę umieść w pakiecie `store`.
2.  Utwórz dwie klasy pochodne od `Product`: `Book` i `Clothing`. W obu klasach nadpisz metodę `getPrice()`. Dla `Book` niech zwraca cenę `29.99`, a dla `Clothing` niech zwraca cenę `59.99`.
3.  W klasie `TestProduct` w pakiecie `store` utwórz tablicę typu `Product` i zainicjuj ją 5 instancjami `Book` i `Clothing`. Iteruj po tablicy wywołując metodę `getPrice()` dla każdego produktu (wyświetl ceny na standardowym wyjściu).

### Zadanie 4 – Klasa Game i pakiety
W jednym projekcie wykonaj następujące czynności:
1.  Stwórz abstrakcyjną klasę `Game` zawierającą publiczną abstrakcyjną metodę `getRating()`, która nie przyjmuje argumentów i zwraca `double`. Klasę umieść w pakiecie `entertainment`.
2.  Utwórz dwie klasy pochodne od `Game`: `StrategyGame` i `AdventureGame`. W obu klasach nadpisz metodę `getRating()`. Dla `StrategyGame` niech zwraca ocenę `8.5`, a dla `AdventureGame` niech zwraca ocenę `7.3`.
3.  W klasie `TestGame` w pakiecie `entertainment` utwórz listę tablicową typu `Game` i zainicjalizuj ją 5 instancjami `StrategyGame` i `AdventureGame`. Iteruj po liście tablicowej wywołując metodę `getRating()` dla każdej gry (wyświetl oceny na standardowym wyjściu).

---

## Lekcja 7

### Zadanie 1 – Klasa Employee i Comparable
Napisz klasę `Employee`, która zawiera pola: `name` (typu `String`), `salary` (typu `double`) i `employmentDate` (typu `LocalDate`).
Zaimplementuj interfejs `Comparable` w taki sposób, aby obiekty klasy `Employee` były sortowane **rosnąco według pensji**.
Stwórz listę tablicową (`ArrayList`) 5 obiektów klasy `Employee` i posortuj ją według sprecyzowanego kryterium.

### Zadanie 2 – Klasa Client i Comparable
Napisz klasę `Client`, która zawiera pola: `name` (typu `String`), `clientNumber` (typu `int`) i `lastLogin` (typu `Date` - `java.util.Date`).
Zaimplementuj interfejs `Comparable` w taki sposób, aby obiekty klasy `Client` były sortowane **malejąco według daty ostatniego logowania**.
Stwórz listę tablicową 5 obiektów klasy `Client` i posortuj ją według sprecyzowanego kryterium.

### Zadanie 3 – Klasa Book i Comparable
Napisz klasę `Book`, która zawiera pola: `title` (typu `String`), `numberOfPages` (typu `int`) i `publicationDate` (typu `LocalDate`).
Zaimplementuj interfejs `Comparable` w taki sposób, aby obiekty klasy `Book` były sortowane **malejąco według liczby stron**.
Stwórz tablicę 4 obiektów klasy `Book` i posortuj ją według sprecyzowanego kryterium.

### Zadanie 4 – Klasa Product i Comparator
Napisz klasę `Product` z polami `id` (typu `int`), `name` (typu `String`) oraz `price` (typu `double`).
Zaimplementuj interfejs `Comparator` do porównywania obiektów:
1.  Po polu `price` (od najniższej do najwyższej ceny),
2.  W przypadku równości cen – po polu `id`.

Stwórz listę 5 obiektów klasy `Product` i posortuj ją zgodnie z opisanym kryterium.

### Zadanie 5 – Klasa Person i Comparator
Napisz klasę `Person` z polami `firstName` (typu `String`), `lastName` (typu `String`) oraz `birthDate` (typu `LocalDate`).
Zaimplementuj generyczny interfejs `Comparator` do porównywania obiektów:
1.  Po polu `lastName` (alfabetycznie od A do Z),
2.  W przypadku równości nazwisk – po polu `firstName`.

Stwórz tablicę 5 obiektów klasy `Person` i posortuj ją zgodnie z opisanym kryterium.

### Zadanie 6 – Klasa Song i wiele Comparatorów
Napisz klasę `Song` z polami `title` (typu `String`), `artist` (typu `String`) oraz `duration` (typu `int`).
Zaimplementuj dwie klasy implementujące generyczny interfejs `Comparator`:
1.  `DurationComparator` – do porównywania obiektów po polu `duration` (od najkrótszej do najdłuższej piosenki).
2.  `ArtistTitleComparator` – do porównywania obiektów po polu `artist` (alfabetycznie od A do Z), a w przypadku równości po polu `title`.

Stwórz tablicę 5 obiektów klasy `Song` i posortuj ją, wykorzystując oba kryteria (najpierw sortowanie po długości utworu, a w przypadku tej samej długości – według artysty i tytułu).

---

## Lekcja 8

### Zadanie 1 – Klasa Teacher i Cloneable
Napisz klasę `Teacher` z trzema polami: `name` (String), `subject` (String) i `experience` (int).
Zaimplementuj interfejs `Cloneable` i nadpisz metodę `clone()`, aby móc klonować obiekty tej klasy.
W metodzie `main()` utwórz obiekt `Teacher`, sklonuj go, a następnie zmień doświadczenie (`experience`) oryginalnego nauczyciela.
Wyświetl doświadczenie obu nauczycieli, aby zobaczyć, czy są niezależne.

### Zadanie 2 – Klasa Athlete i klonowanie listy
Napisz klasę `Athlete` z dwoma polami: `name` (String) i `lapTimes` (lista tablicowa zmiennych typu `int`, reprezentująca czas w sekundach potrzebny na przebiegnięcie okrążenia podczas różnych prób).
Zaimplementuj interfejs `Cloneable` i nadpisz metodę `clone()`, aby móc klonować obiekty tej klasy.
W metodzie `main()` utwórz obiekt `Athlete`, sklonuj go, a następnie zmień czas na pozycji 3 oryginalnego sportowca.
Wyświetl czasy obu sportowców, aby zobaczyć, czy są niezależne (sprawdź działanie płytkiej i głębokiej kopii listy).

### Zadanie 3 – Interfejs MyComparator
Stwórz interfejs o nazwie `MyComparator`, który będzie zawierał metodę `compare(int a, int b): int`.
Metoda ta powinna zwrócić:
- `-1`, jeśli `a < b`,
- `0`, jeśli `a == b`,
- `1`, jeśli `a > b`.

Następnie stwórz klasę `TestMyComparator`, która będzie implementować ten interfejs. W klasie tej zaimplementuj metodę `compare` zgodnie z jej opisem.

### Zadanie 4 – Interfejs MusicPlayer
Załóżmy, że mamy interfejs `MusicPlayer` z metodami `turnOn()`, `turnOff()` i `nextTrack()`.
Stwórz klasę `Radio`, która będzie implementować ten interfejs.
- W metodzie `turnOn()` powinien zostać wydrukowany komunikat `"Radio włączone"`.
- W metodzie `turnOff()` – `"Radio wyłączone"`.
- W `nextTrack()` – `"Zmieniono stację radiową"`.

### Zadanie 5 – Interfejs Authentication
Utwórz interfejs `Authentication` z trzema metodami abstrakcyjnymi:
- `login(String username, String password)` zwracającą `boolean`,
- `logout()` zwracającą `void`,
- `resetPassword(String username, String oldPassword, String newPassword)` zwracającą `boolean`.

Stwórz dwie klasy `UserAuthentication` i `AdminAuthentication`, które implementują ten interfejs.
W klasie `AuthenticationTest` przetestuj implementacje metod dla obiektów obu klas.

### Zadanie 6 – Interfejs Sensor
Zaprojektuj interfejs `Sensor` z trzema metodami abstrakcyjnymi:
- `readValue()` zwracającą `double`,
- `getStatus()` zwracającą `String`,
- `reset()` zwracającą `void`.

Stwórz dwie klasy `TemperatureSensor` i `PressureSensor`, które implementują ten interfejs.
W klasie `SensorTest` przetestuj działanie metod dla obiektów z obu klas.

---

## Lekcja 9

### Zadanie 1 – Wyjątek NiepoprawnyFormatDanychException
Zaprojektuj i zaimplementuj klasę wyjątku `NiepoprawnyFormatDanychException`, która będzie rozszerzać klasę `Exception`.
Następnie napisz metodę `sprawdzFormatDanych(String dane)`, która rzuci wyjątek `NiepoprawnyFormatDanychException`, jeśli podany ciąg znaków nie odpowiada określonemu wzorcowi (np. nie jest adresem e-mail).
W metodzie `main` przetestuj działanie tej metody, obsługując wyjątek i informując użytkownika o błędzie.

### Zadanie 2 – Dzielenie i obsługa wyjątków
Napisz program, który prosi użytkownika o wpisanie dwóch liczb, a następnie dzieli pierwszą liczbę przez drugą. Program powinien obsługiwać dwa rodzaje wyjątków:
- `ArithmeticException` w przypadku dzielenia przez zero,
- `InputMismatchException` gdy użytkownik wprowadzi coś innego niż liczby.

W obu przypadkach należy wyświetlić stosowny komunikat błędu i poprosić użytkownika o ponowne wprowadzenie danych. Wykorzystaj typ `int`.

### Zadanie 3 – Generyczna metoda isEqual
Napisz generyczną metodę `isEqual`, która przyjmuje dwa dowolne obiekty tego samego typu i zwraca `true`, jeśli są one równe, w przeciwnym razie `false`.

### Zadanie 4 – Klasa generyczna Counter
Stwórz klasę generyczną `Counter<T>`, która będzie zliczać ilość dodanych elementów określonego typu.
Klasa powinna mieć:
- metodę `add(T element)`, która dodaje element do wewnętrznej struktury,
- metodę `getCount()`, która zwraca liczbę dodanych elementów.

### Zadanie 5 – Klasa generyczna Triple
Stwórz klasę generyczną `Triple<T, U, V>`, która może przechowywać trzy obiekty różnych typów.
Zaimplementuj metody `getFirst()`, `getSecond()` i `getThird()` do pobierania odpowiednio pierwszego, drugiego i trzeciego elementu.

### Zadanie 6 – Generyczna metoda max
Napisz generyczną metodę `max`, która przyjmuje tablicę elementów typu porównywalnego (implementujących interfejs `Comparable<T>`) i zwraca element o najwyższej wartości.
Uwzględnij obsługę przypadku pustej tablicy.
