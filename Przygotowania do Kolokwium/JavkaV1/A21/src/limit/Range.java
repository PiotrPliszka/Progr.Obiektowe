package limit;

public class Range {
    public static <T extends Comparable<T>>boolean isOutOfRange(T parameter, T lowerLimit, T upperLimit){
        if (parameter != null && lowerLimit != null && upperLimit != null){
            if (parameter.compareTo(upperLimit) <= 0 && parameter.compareTo(lowerLimit) >= 0){
                return true;
            }
            return false;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    static void main() {
        System.out.println(isOutOfRange(5, 1, 10));
        System.out.println(isOutOfRange(11, 1, 10));
        System.out.println(isOutOfRange(0, 1, 10));
        try{
            isOutOfRange(null, 5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Wykryto bład");
        }
    }
}
