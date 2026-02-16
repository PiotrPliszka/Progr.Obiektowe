package zad3;

public class Użytkownik {
    private Powiadomienie p1;

    public Użytkownik(Powiadomienie p1) {
        this.p1 = p1;
    }
    public void powiadomOModernizacji(String informacja){
        p1.wyslij(informacja);
    }

    static void main(String[] args) {
        Powiadomienie p = new Email();
        Użytkownik u = new Użytkownik(p);
        u.powiadomOModernizacji("JUTREO MODERNIZACJA");
    }
}
