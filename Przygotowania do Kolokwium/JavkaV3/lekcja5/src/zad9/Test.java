package zad9;

public class Test {
    public <T extends Comparable<T>> T min(T[] array) {
        if (array == null || array.length == 0){
            throw new IllegalArgumentException();
        }
        T minVal = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i].compareTo(minVal) < 0){
                minVal = array[i];
            }
        }
        return minVal;
    }
}
