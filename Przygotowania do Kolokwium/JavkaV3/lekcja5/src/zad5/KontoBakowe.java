package zad5;

public class KontoBakowe {
    public double saldo;

    public KontoBakowe(double saldo) {
        this.saldo = saldo;
    }

    public void wyplac(double kwota) throws NiewystarczajaceSrodkiException{
        if (kwota > saldo){
            throw new NiewystarczajaceSrodkiException();
        }
        this.saldo -= kwota;
    }
}
