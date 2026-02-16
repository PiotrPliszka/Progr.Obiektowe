package electronics;

import java.util.ArrayList;
import java.util.Objects;

public class Radio {
    private String model;
    private String manufacturer;
    private ArrayList<Double> stations;

    public Radio(String model, String manufacturer, ArrayList<Double> stations) {
        if (model == null){
            this.model = "";
        }
        else{
            this.model = model;
        }
        if (manufacturer == null){
            this.manufacturer = "";
        }
        else {
            this.manufacturer = manufacturer;
        }

        if (stations == null){
            this.stations = new ArrayList<>();
        }
        else{
            this.stations = new ArrayList<>(stations);
        }
    }

    public void setModel(String model) {
        if (model != null){
            this.model = model;
        }
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer != null){
            this.manufacturer = manufacturer;
        }
    }

    public void setStations(ArrayList<Double> stations) {
        if (stations != null){
            this.stations = new ArrayList<>(stations);
        }
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public ArrayList<Double> getStations() {
        return new ArrayList<>(this.stations);
    }

    public void addStation(double station){
        this.stations.add(station);
    }

    public void removeStation(double station){
        this.stations.remove(station);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getModel() + ", " + getManufacturer() + ", Stations: " + getStations();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Radio radio = (Radio) o;
        return Objects.equals(getModel(), radio.getModel()) && Objects.equals(getManufacturer(), radio.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getManufacturer());
    }
}
