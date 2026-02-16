import zad1.Biuro;
import zad1.Printer;
import zad1.StandardowyPrinter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Printer p1 = new StandardowyPrinter();
    Biuro b1 = new Biuro(p1);
    b1.drukujDokument("XDDD");
}
