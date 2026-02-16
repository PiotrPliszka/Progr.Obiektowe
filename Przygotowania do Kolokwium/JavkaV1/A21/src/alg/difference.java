package alg;

import java.util.TreeSet;

public class difference {
    public static <E>int calculateSymmetricDifference(TreeSet<E> setOne, TreeSet<E> setTwo){
        if (setOne == null || setTwo == null){
            throw new IllegalArgumentException();
        }
        int count = 0;
        for (E item : setOne){
            if (!setTwo.contains(item)){
                count++;
            }
        }
        for (E item : setTwo){
            if (!setOne.contains(item)){
                count++;
            }
        }
        return count;
    }

    static void main() {
        TreeSet<Integer> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();
        s1.add(5);
        s1.add(2);
        s1.add(1);
        s1.add(10);

        s2.add(5);
        s2.add(3);
        s2.add(2);
        System.out.println(calculateSymmetricDifference(s1, s2));

        try{
            calculateSymmetricDifference(s1, null);
        }catch (IllegalArgumentException e){
            System.out.println("Złapano bład");
        }
    }
}
