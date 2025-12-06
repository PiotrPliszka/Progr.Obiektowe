import zad1.*;
import zad2.ElectronicDevice;
import zad2.Laptop;
import zad2.Smartphone;
import zad2.Television;


void main(String[] args) {
//    ZAD1
    ArrayList<ComputerGraphic> graphics = new ArrayList<ComputerGraphic>();
    graphics.add(new Bitmap(800, 600, "obraz1.bmp"));
    graphics.add(new Vector(1024, 768, "grafika1.svg"));
    graphics.add(new Bitmap(400, 300, "obraz2.bmp"));
    graphics.add(new Vector(1920, 1080, "logo.svg"));
    graphics.add(new Bitmap(1280, 720, "tapeta.bmp"));

    for (ComputerGraphic g: graphics){
        g.loadFile();
        g.saveFile();
        System.out.println();
    }
//    ZAD2
    ArrayList<ElectronicDevice> electronic = new ArrayList<>();
    electronic.add(new Smartphone("Samsung", "Galaxy", 2005));
    electronic.add(new Laptop("Apple", "Macbook Air", 2020));
    electronic.add(new Television("Panasonic", "SuperMax", 2025));
    electronic.add(new Smartphone("Apple", "iPhone", 2015));
    electronic.add(new Smartphone("Samsung", "Galaxy 25", 2026));

    for (ElectronicDevice g: electronic){
        g.turnOn();
        g.turnOff();
        System.out.println();
    }

}