package zad1;

public abstract class ComputerGraphic {
    public int width;
    public int height;
    public String fileName;

    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public abstract void loadFile();
    public abstract void saveFile();
}