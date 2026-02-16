package zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    static void main(String[] args) {
        Song s1 = new Song("Dupa", "Gładek", 120);
        Song s2 = new Song("Kutas", "Dziadek", 90);
        ArrayList<Song> list = new ArrayList<>(Arrays.asList(s1, s2));
        DurationComparator com1 = new DurationComparator();
        ArtistTitleComparator com2 = new ArtistTitleComparator();
        Collections.sort(list, com1.thenComparing(com2));

        for(Song e : list){
            System.out.println(e);
        }
    }
}
