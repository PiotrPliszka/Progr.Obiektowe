package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Collection {
    public static <E>void filterCollection(ArrayList<E> items, Predicate<E> condition){
        if (items == null || condition == null){
            throw new IllegalArgumentException();
        }
        items.removeIf(condition.negate());
    }

    static void main(String[] args) {
        System.out.println("--- Test 1: Filtrowanie liczb parzystych ---");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Przed filtrowaniem: " + numbers);


        Predicate<Integer> isEven = n -> n % 2 == 0;
        filterCollection(numbers, isEven);

        System.out.println("Po filtrowaniu (tylko parzyste): " + numbers);
        if (numbers.size() == 5 && numbers.contains(2) && !numbers.contains(1)) {
            System.out.println("Status: OK");
        } else {
            System.out.println("Status: BŁĄD");
        }
        System.out.println("\n--- Test 2: Walidacja null ---");
        try {
            filterCollection(null, isEven);
        } catch (IllegalArgumentException e) {
            System.out.println("Złapano oczekiwany wyjątek (lista null): " + e.getMessage());
        }

        try {
            filterCollection(numbers, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Złapano oczekiwany wyjątek (predykat null): " + e.getMessage());
        }
    }
}
