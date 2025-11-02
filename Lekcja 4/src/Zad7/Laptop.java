package Zad7;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer {
    public int weight;

    public Laptop(String manufacturer, String model, ArrayList<Double> partsPrices, int weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }

    ;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return getWeight() == laptop.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "weight=" + weight +
                '}';
    }
}