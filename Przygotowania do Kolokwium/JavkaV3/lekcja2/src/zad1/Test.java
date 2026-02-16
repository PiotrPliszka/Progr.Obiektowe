package zad1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static void main(String[] args) {
        Bitmap b1 = new Bitmap(10, 20, "BitMap");
        Vector v1 = new Vector(20, 30, "Vector");

        ArrayList<ComputerGraphic> list = new ArrayList<>(Arrays.asList(b1, v1));
        for (ComputerGraphic e: list){
            e.loadFile();
            e.saveFile();
        }
    }
}
