
package zad2;

import java.util.Objects;

public class Vechicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vechicle(String brand, String model, int year) {
        if (year >= 2025) {
            this.yearOfProduction = 2025;
        } else {
            this.yearOfProduction = year;
        }

        if (brand == null) {
            this.brand = "";
        } else {
            if (brand.isEmpty()) {
                this.brand = "";
            } else {
                this.brand = brand;
            }
        }

        if (model == null) {
            this.model = "";
        } else {
            if (model.isEmpty()) {
                this.model = "";
            } else {
                this.model = model;
            }
        }
    }

    @Override
    public String toString() {
        return "Vechicle:" + brand + " " + model + " Age: " + yearOfProduction;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Vechicle vechicle)) {
            return false;
        }

        return yearOfProduction == vechicle.yearOfProduction &&
                vechicle.brand.equals(brand) &&
                vechicle.model.equals(model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

}
