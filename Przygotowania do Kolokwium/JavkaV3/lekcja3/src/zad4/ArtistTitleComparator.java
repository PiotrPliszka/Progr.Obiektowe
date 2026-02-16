package zad4;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        int result = o1.artist.compareTo(o2.artist);
        if (result != 0){
            return result;
        }
        else{
            return o1.title.compareTo(o2.title);
        }
    }
}
