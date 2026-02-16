package zad3;

public class PointC {
    public int x;
    public int y;

    public PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointR toRecord(){
        return new PointR(this.x, this.y);
    }
}
