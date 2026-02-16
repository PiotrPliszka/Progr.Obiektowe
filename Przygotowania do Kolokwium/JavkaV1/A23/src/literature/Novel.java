package literature;

import java.util.ArrayList;
import java.util.Objects;

public class Novel {
    private String title;
    private String author;
    private ArrayList<Double> ratings;

    public Novel(String title, String author, ArrayList<Double> ratings) {
        this.title = title;
        this.author = author;
        setRatings(ratings);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRatings(ArrayList<Double> ratings) {
        if (ratings == null){
            this.ratings = new ArrayList<Double>();
        }
        else{
            this.ratings = new ArrayList<>(ratings);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(this.ratings);
    }

    public void addRating(double rating){
        this.ratings.add(rating);
    }
    public void removeRating(double rating){
        this.ratings.remove(rating);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getTitle() + ", " + getAuthor() + ", Ratings: " + getRatings();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(getTitle(), novel.getTitle()) && Objects.equals(getAuthor(), novel.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
}
