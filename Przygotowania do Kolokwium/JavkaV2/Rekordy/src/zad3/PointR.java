package zad3;

public record PointR(int x, int y) {

    public PointC toClass(){
        return new PointC(x, y);
    }
}
