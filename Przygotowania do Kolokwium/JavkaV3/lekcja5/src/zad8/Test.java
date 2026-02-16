package zad8;

public class Test {
    public static <T extends Comparable<T>> T max(T[] array){
        T maxVal = array[0];
        for(int i=1; i< array.length; i++){
            if (array[i].compareTo(maxVal) > 0){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
