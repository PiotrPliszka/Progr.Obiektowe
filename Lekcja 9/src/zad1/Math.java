package zad1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Math {
    static void main(String[] args) {
        try{
            System.out.println("Podaj liczbe a: ");
            Scanner skaner = new Scanner(System.in);
            int a = skaner.nextInt();
            System.out.println("Podaj liczbe b: ");
            int b = skaner.nextInt();

            int wynik = a / b;
            System.out.println("Wynik dzielenia: " + wynik);

        }catch (ArithmeticException e){
            System.out.println("Nie dziel przez zero");
        }catch (InputMismatchException e){
            System.out.println("Niepoprawne dane");
        }

    }
}

