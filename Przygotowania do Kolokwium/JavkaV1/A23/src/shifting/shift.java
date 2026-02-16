package shifting;

import java.util.Arrays;

public class shift {
    public static <T>void shiftLeft(T[] tab){
        if (tab == null){
            throw new NullPointerException("Tab cannot be null");
        }
        if (tab.length == 0){
            throw new IllegalArgumentException("Tab cannot be empty");
        }
        if (tab.length == 1){
            return;
        }
        T firstElement = tab[0];
        for (int i = 0; i < tab.length - 1; i++){
            tab[i] = tab[i+1];
        }
        tab[tab.length -1] = firstElement;
    }

    static void main(String[] args) {
        Integer[] xd = {1, 2, 3, 4, 5};
        shiftLeft(xd);
    }
}
