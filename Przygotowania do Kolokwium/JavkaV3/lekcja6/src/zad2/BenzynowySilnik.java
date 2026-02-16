package zad2;

public class BenzynowySilnik implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("BRRRRRR");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("KAPUT");
    }
}
