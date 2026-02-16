package zad5;

public class MyClass {
    public <T extends Comparable<T>> T max(T[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException();
        }

        T maxVal = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(maxVal) > 0){
                maxVal = array[i];
            }
        }
        return maxVal;
    }

    static void main(String[] args) {
        Integer[] tab = {10, 2, 23, 44, 5};
        MyClass c1 = new MyClass();
        System.out.println(c1.max(tab));
    }
}
