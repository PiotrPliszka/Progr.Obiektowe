package zad1;

public class MyClass {
    public void checkAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Wiek poniżej 18");
        }
        System.out.println("Wiek się zgadza");
    }
}
