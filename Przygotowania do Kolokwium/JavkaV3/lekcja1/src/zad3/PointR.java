package zad3;

public record PointR(int x, int y) {
    public PointC swapC(){
        return new PointC(this.x, this.y);
    }
}
