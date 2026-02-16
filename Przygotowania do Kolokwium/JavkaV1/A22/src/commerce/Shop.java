package commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop implements Comparable<Shop>{
    private double revenue;
    private String name;
    private  int employeeCount;

    public Shop(double revenue, String name, int employeeCount) {
        this.revenue = revenue;
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public int compareTo(Shop o) {
        int count = Integer.compare(o.getEmployeeCount(), this.employeeCount);
        if (count != 0){
            return count;
        }
        else {
            return o.getName().compareTo(this.name);
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "revenue=" + revenue +
                ", name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }

    static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop(1000.0, "Sklep A", 5));
        shops.add(new Shop(2000.0, "Gigant", 100));
        shops.add(new Shop(1500.0, "Sklep B", 5));
        shops.add(new Shop(500.0, "Mały Sklepik", 2));
        shops.add(new Shop(3000.0, "Średniak", 50));

        System.out.println("--- Przed sortowaniem ---");
        for (Shop s : shops) {
            System.out.println(s);
        }
        Collections.sort(shops);

        System.out.println("\n--- Po sortowaniu ---");
        for (Shop s : shops) {
            System.out.println(s);
        }
    }
}

