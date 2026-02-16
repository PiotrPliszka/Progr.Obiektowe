package zad3;

public class Book implements Comparable<Book>{
    public String title;
    public int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages, this.numberOfPages);
    }
}
