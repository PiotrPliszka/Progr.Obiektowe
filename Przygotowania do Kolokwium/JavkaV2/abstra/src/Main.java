import zad1.*;
import zad2.ElectronicDevice;
import zad2.Laptop;
import zad2.Smartphone;
import zad2.*;


void main() {
    Bitmap b1 = new Bitmap(10, 20, "Bitmap1");
    Vector v1 = new Vector(22, 32, "Vector1");
    ArrayList<ComputerGraphic> lista = new ArrayList<>(Arrays.asList(b1, v1));
    for (ComputerGraphic c1 : lista){
        c1.saveFile();
        c1.loadFile();
    }

//    ZAD2
    Smartphone s1 = new Smartphone("Apple", "X", 2020);
    Laptop l1 = new Laptop("Asus", "ROG", 2022);
    ArrayList<ElectronicDevice> list = new ArrayList<>(Arrays.asList(s1, l1));
    for (ElectronicDevice e1: list){
        e1.turnOff();
        e1.turnOn();
    }
}
