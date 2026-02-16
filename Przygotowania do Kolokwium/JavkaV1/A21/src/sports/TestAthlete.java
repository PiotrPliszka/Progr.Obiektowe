package sports;

import java.util.Arrays;

public class TestAthlete {
    static void main() {
        Athlete a1 = new Athlete("Piotr", "Bieganie", 10);
        Athlete a2 = new Athlete("Artur", "Skaknie", 10);
        Athlete a3 = new Athlete("Andzelika", "Bieganie", 50);
        Athlete a4 = new Athlete("Bartek", "Bieganie", 20);
        Athlete a5 = new Athlete("Dawid", "Bieganie", 5);
        Athlete[] tab = {a1, a2, a3, a4, a5};
        System.out.println("Przed sortowaniem");
        for (Athlete element : tab){
            System.out.println(element);
        }
        Arrays.sort(tab, new ScoreNameComparator());
        System.out.println("\nPo sortowaniu");
        for (Athlete element : tab){
            System.out.println(element);
        }
    }
}
