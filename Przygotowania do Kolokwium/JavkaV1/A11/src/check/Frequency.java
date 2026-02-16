package check;

public class Frequency {
    public static <T>int computeFrequency(T[] tab, T element){
        if (tab == null || element == null){
            throw new IllegalArgumentException();
        }

        int count = 0;
        for (T item : tab){
            if (item == null){
                throw new IllegalArgumentException();
            }
            if (item.equals(element)){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        Song s1 = new Song(50.5, 10);
        Song s2 = new Song(90.5, 3);
        Song s3 = new Song(70.0, 7);
        Song s4 = new Song(54.9, 9);
        Song s5 = new Song(54.9, 9);
        Song s6 = new Song(54.9, 9);
        Song[] tab = {s1, s2, s3, s4, s5, s6};
        Song[] tab2 = {s1, s2, null, s4, s5, s6};
        System.out.println(computeFrequency(tab, s4));
//        System.out.println(computeFrequency(tab2, s4));
//        System.out.println(computeFrequency(tab2, null));
        try{
            computeFrequency(tab2, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Złapano bład");
        }
    }
}
