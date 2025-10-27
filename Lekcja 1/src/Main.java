
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        float num2 = 4.5f; // f - trzeba napisac bo w domyśle 4.5 to double
        double num3;
        long l64bit;
        short s16bit;
        byte l8bit;
        char te = 't';
        boolean t = true;
        boolean f = false;

        int[] tab1 = {1,2,4,6,7,89,90};
        int[] pustaTablica = new int[10]; // deklarowanie pustej tablicy

        pustaTablica[0] = 6;

        // Listy tablicowe
        ArrayList<Integer> listaTablicowa = new ArrayList<>();
        ArrayList<Double> listaTablicowa1 = new ArrayList<>();

//        listaTablicowa.add(1); // 0
//        listaTablicowa.add(2); // 1
//        listaTablicowa.add(3); // 2
//        listaTablicowa.add(4); // 3
//        listaTablicowa.add(5); // 4

//        System.out.println(listaTablicowa.get(2));

        String txt;


//        Zadanie 1

        for (int i = 1; i < 10; i++){
            listaTablicowa.add(i);
        }

        for (double i = 5; i < 11; i++){
            listaTablicowa1.add(i);
        }

        String napis = "Cześć";
        napis = napis + "!";

        StringBuilder strBild = new StringBuilder("Cześć");
        strBild.append(" XD");
        System.out.println(strBild.toString());


//        Zadanie 2

//        System.out.println(minimumValue(listaTablicowa));

//        Zadanie 3
//        System.out.println(listaTablicowa1);
//        System.out.println(average(listaTablicowa1));

        trudene();
    }

    static Integer minimumValue(ArrayList<Integer> li){
        int min = 0;
        if (li.size() <= 0){
            return 0;
        }

        for(int i = 0; i < li.size(); i++){

            if(i == 0){
                min = li.get(i);
            }
            else if (li.get(i) < min){
                min = li.get(i);
            }
        }
        return min;
    };

    static double average(ArrayList<Double> li){
        if (li.size() == 0) return 0;

        double avg = 0;
        int counter = 0;

        for (int i = 0; i < li.size(); i++){
            avg += li.get(i);
            counter++;
        }

        return avg/counter;
    };

    static void trudene(){
        System.out.println("Wprowadź znak na piramide: ");
        Scanner scr = new Scanner(System.in);

        String znak = scr.next();
        System.out.println("Podaj wysokosc piramidy: ");
        int wys = scr.nextInt();

        for (int i = 0; i < wys; i++){
            StringBuilder pietro = new StringBuilder();
            for(int j = 0; j < wys - i - 1; j++){
                pietro.append(' ');
            }

            for (int k = 0; k < 2*i + 1; k++) {
                pietro.append(znak);
            }
            System.out.println(pietro);
        }

    };
}
