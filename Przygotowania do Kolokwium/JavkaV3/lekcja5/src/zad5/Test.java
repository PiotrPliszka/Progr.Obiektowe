package zad5;

public class Test {
    static void main(String[] args) {
        KontoBakowe konto = new KontoBakowe(2000.0);
        try{
            konto.wyplac(3000);
        } catch (NiewystarczajaceSrodkiException e) {
            System.out.println(e.getMessage());
        }
    }
}
