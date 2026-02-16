package tech;

public class Min {
    public static <T extends Comparable<T>>T firstMinValue(T[] tab){
        if (tab == null || tab.length == 0){
            throw new IllegalArgumentException("Tab cannot be null and empty");
        }

        T minVal = tab[0];
        int counter = 1;
        for (int i = 1; i < tab.length; i++){
            int comp = minVal.compareTo(tab[i]);

            if (comp < 0){
                minVal = tab[i];
                counter = 1;
            }
            if (comp == 0){
                counter++;
            }
        }
        if (counter > 1){
            throw new IllegalArgumentException();
        }
        return minVal;
    }
}
