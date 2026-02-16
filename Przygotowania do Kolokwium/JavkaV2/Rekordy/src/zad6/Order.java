package zad6;

import java.util.ArrayList;

public record Order(ArrayList<Prodcut> lista) {
    public void totalValue(){
        double all = 0.0;
        for (Prodcut price : lista){
            all += price.price();
        }
        System.out.println("Cena wszystkiego: " + all);
    }
}
