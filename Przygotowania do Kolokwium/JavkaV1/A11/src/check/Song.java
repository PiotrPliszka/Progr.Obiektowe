package check;

import java.util.Objects;

public class Song {
    private double duration;
    private int rating;

    public Song(double duration, int rating) {
        this.duration = duration;
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Double.compare(getDuration(), song.getDuration()) == 0 && getRating() == song.getRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDuration(), getRating());
    }

    @Override
    public String toString() {
        return "Song{" +
                "duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}
