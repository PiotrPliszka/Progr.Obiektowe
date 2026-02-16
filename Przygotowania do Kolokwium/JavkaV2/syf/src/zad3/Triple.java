package zad3;

public class Triple<T, U, V>{
    public T firstElemnet;
    public U secondElement;
    public V thirdElement;

    public Triple(T firstElemnet, U secondElement, V thirdElement) {
        this.firstElemnet = firstElemnet;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }

    public T getFirstElemnet() {
        return firstElemnet;
    }

    public U getSecondElement() {
        return secondElement;
    }

    public V getThirdElement() {
        return thirdElement;
    }
}
