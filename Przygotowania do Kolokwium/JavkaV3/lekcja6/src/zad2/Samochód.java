package zad2;

public class Samochód {
    private Silnik silnik;

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        this.silnik.uruchom();
    }

    public void stop(){
        this.silnik.zatrzymaj();
    }

    static void main(String[] args) {
        Silnik s = new BenzynowySilnik();
        Samochód s1 = new Samochód(s);
        s1.start();
        s1.stop();
    }
}
