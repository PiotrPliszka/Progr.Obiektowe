package validation;

public class Match {
    public static <T>boolean isAnyMatch(T first, T second, T third){
        if (first == null || second == null || third == null){
            throw new IllegalArgumentException("Arguemnts cannot be null");
        }
        return first.equals(second) || first.equals(third) || second.equals(third);
    }
    public static void main(String[] args) {
        System.out.println("--- Testy pozytywne i negatywne ---");
        boolean result1 = isAnyMatch("Apple", "Apple", "Banana");
        System.out.println("Test 1 (dwa równe): " + result1);

        boolean result2 = isAnyMatch(1, 2, 3);
        System.out.println("Test 2 (wszystkie różne): " + result2);

        boolean result3 = isAnyMatch(10.5, 10.5, 10.5);
        System.out.println("Test 3 (wszystkie równe): " + result3);

        System.out.println("\n--- Test wyjątku (null) ---");
        try {
            isAnyMatch("Test", null, "Test");
        } catch (IllegalArgumentException e) {
            System.out.println("Złapano oczekiwany błąd: " + e.getMessage());
        }
    }
}
