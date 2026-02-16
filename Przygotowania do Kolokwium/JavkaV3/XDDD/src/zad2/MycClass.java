package zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MycClass {
    public void operation(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean current = false;
        while(!current){
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                current = true;
            }
            catch (InputMismatchException e){
                System.out.println("Podawaj same Liczby");
                scanner.next();
            }
        }

        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("NIe dziel przez zero");
        }
    }

    static void main(String[] args) {
        MycClass c = new MycClass();
        c.operation();
    }
}
