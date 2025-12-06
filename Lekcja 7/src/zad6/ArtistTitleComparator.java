package zad6;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int result = o1.getArtist().compareTo(o2.getArtist());
        if (result > 0){
            return 1;
        }
        else if (result < 0) {
            return -1;
        }
        else{
            int result2= o1.getTitle().compareTo(o2.getTitle());
                if (result2 > 0){
                    return 1;
                }
                else if (result2 < 0){
                    return -1;
                }
                else {
                    return 0;
                }
        }
    }
}
