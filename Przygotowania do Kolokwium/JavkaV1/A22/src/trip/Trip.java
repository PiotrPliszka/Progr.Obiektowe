package trip;

import java.util.Arrays;
import java.util.Objects;

public class Trip {
    private double cost;
    private String destination;
    private double[] distances;

    public Trip(double cost, String destination, double[] distances) {
        setCost(cost);
        setDestination(destination);
        setDistances(distances);
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDestination(String destination) {
        if (destination == null){
            throw new IllegalArgumentException("Destination cannot be null");
        }
        else {
            this.destination = destination;
        }
    }

    public void setDistances(double[] distances) {
        if (distances == null){
            throw new IllegalArgumentException("Distances array cannot be null");
        }
        else {
            this.distances = distances.clone();
        }
    }

    public double getCost() {
        return cost;
    }

    public String getDestination() {
        return destination;
    }

    public double[] getDistances() {
        return distances.clone();
    }

    public void distancesAdd(double distance){
        double[] newDistance = Arrays.copyOf(this.distances, this.distances.length + 1);
        newDistance[newDistance.length - 1] = distance;
        this.distances = newDistance;
    }
    public void distancesRemove(int index){
        if (index < 0 || index >= this.distances.length){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        double[] newDistances = new double[this.distances.length - 1];
        int x = 0;
        for (int i = 0; i < this.distances.length; i++){
            if (i == index){
                continue;
            }
            newDistances[x] = this.distances[i];
            x++;
        }
        this.distances = newDistances;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getCost() + ", " + getDestination() + ", " + Arrays.toString(getDistances()) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;
        return Double.compare(getCost(), trip.getCost()) == 0 && Objects.equals(getDestination(), trip.getDestination()) && Arrays.equals(getDistances(), trip.getDistances());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getDestination(), Arrays.hashCode(getDistances()));
    }
}
