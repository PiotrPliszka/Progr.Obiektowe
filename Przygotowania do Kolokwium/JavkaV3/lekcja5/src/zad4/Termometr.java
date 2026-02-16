package zad4;

import java.util.Scanner;

public class Termometr {
    public void ustawTemperature(double stopnie){
        if (stopnie < -273.15){
            throw new IllegalArgumentException("Temperatura ponizej zera bezwzględnego");
        }
        System.out.println("Temperatura wynosi: " + stopnie);
    }

    static void main(String[] args) {
        Termometr t1 = new Termometr();
        boolean isCorrect = false;
        double a = 0.0;
        while(!isCorrect){
            Scanner scanner = new Scanner(System.in);
            try{
                a = scanner.nextDouble();
                t1.ustawTemperature(a);
                isCorrect = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
