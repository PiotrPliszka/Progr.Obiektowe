package alg;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class same {
    public static <K,V>boolean allValuesSame(HashMap<K,V> hashMap){
        V firstValue = null;
        boolean isFirst = true;
        for (Map.Entry<K, V> entry : hashMap.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null){
                throw  new NullPointerException();
            }
            if (isFirst){
                firstValue = value;
                isFirst = false;
            }else{
                if(!firstValue.equals(value)){
                    return false;
                }
            }
        }
        return true;
    }
    Predicate<Integer> isEven = n -> n/2 == 0;
}
