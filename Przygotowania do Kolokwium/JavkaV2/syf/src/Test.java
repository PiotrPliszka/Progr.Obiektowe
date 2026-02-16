import java.awt.im.InputMethodRequests;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Nie dizel przez zero");
        }
        catch (InputMismatchException e){
            System.out.println("Podawaj tylko liczby");
        }
    }
}
