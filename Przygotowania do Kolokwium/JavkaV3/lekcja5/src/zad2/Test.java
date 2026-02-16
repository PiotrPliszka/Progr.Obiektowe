package zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby całkowite: ");
        int a = 0;
        int b = 0;
        boolean isCorrect = false;
        while (!isCorrect) {
            try {
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                b = input.nextInt();
                isCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Podaj dwie liczby całkowite: ");
            }
        }

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
        }
    }
}