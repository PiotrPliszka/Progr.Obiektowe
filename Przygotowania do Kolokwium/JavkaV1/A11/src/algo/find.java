package algo;

import java.util.HashMap;
import java.util.Map;

public class find {
    public static <K, V extends Comparable<V>>K findMaxValueKey(HashMap<K, V> hashMap) {
        if (hashMap == null){
            throw new IllegalArgumentException();
        }

        K key = null;
        V max = null;
        for (Map.Entry<K, V> item : hashMap.entrySet()) {
            if (item.getValue() == null){
                continue;
            }
            if (max == null || item.getValue().compareTo(max) > 0) {
                max = item.getValue();
                key = item.getKey();
            }
        }
        return key;
    }

    static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Anna", 85);
        scores.put("Bartek", 92);
        scores.put("Celina", 70);
        System.out.println(findMaxValueKey(scores));

        HashMap<String, Integer> scoresWithNulls = new HashMap<>();
        scoresWithNulls.put("Adam", null);
        scoresWithNulls.put("Ewa", 40);
        scoresWithNulls.put("Piotr", null);
        scoresWithNulls.put("Zosia", 60);
        System.out.println(findMaxValueKey(scoresWithNulls));

        HashMap<String, Integer> allNulls = new HashMap<>();
        allNulls.put("X", null);
        allNulls.put("Y", null);
        System.out.println(findMaxValueKey(allNulls));

        try{
            findMaxValueKey(null);
        }catch (IllegalArgumentException e){
            System.out.println("Złapano wyjątek");
        }
    }
}
