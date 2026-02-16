package zad1;

public class Biuro {
    private Printer p1;

    public Biuro(Printer p1) {
        this.p1 = p1;
    }

    public void drukujDokument(String tekst){
        this.p1.drukuj(tekst);
    }

    static void main(String[] args) {
        Printer p = new StandardowyPrinter();
        Biuro b1 = new Biuro(p);
        b1.drukujDokument("Wydrukowano");
    }
}
