package satellitemanagement;

import java.util.Objects;

public class SatelliteSpecs {
    private String modelName;
    private int launchYear;
    private int orbitAltitude;

    public SatelliteSpecs(String modelName, int launchYear, int orbitAltitude) {
        setModelName(modelName);
        setLaunchYear(launchYear);
        setOrbitAltitude(orbitAltitude);
    }

    public SatelliteSpecs(SatelliteSpecs obj){
        this.modelName = obj.modelName;
        this.launchYear = obj.launchYear;
        this.orbitAltitude = obj.orbitAltitude;
    }


    public void setModelName(String modelName) {
        if (modelName == null){
            this.modelName = "";
        }
        else{
            this.modelName = modelName;
        }
    }

    public void setLaunchYear(int launchYear) {
        if (launchYear < 0){
            this.launchYear = 0;
        }
        else{
            this.launchYear = launchYear;
        }
    }

    public void setOrbitAltitude(int orbitAltitude) {
        if (orbitAltitude < 0){
            this.orbitAltitude = 0;
        }
        else{
            this.orbitAltitude = orbitAltitude;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public int getOrbitAltitude() {
        return orbitAltitude;
    }

    @Override
    public String toString() {
        return "SatelliteSpecs{" +
                "modelName='" + modelName + '\'' +
                ", launchYear=" + launchYear +
                ", orbitAltitude=" + orbitAltitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        SatelliteSpecs that = (SatelliteSpecs) o;
        return getLaunchYear() == that.getLaunchYear() && getOrbitAltitude() == that.getOrbitAltitude() && Objects.equals(getModelName(), that.getModelName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getModelName());
        result = 31 * result + getLaunchYear();
        result = 31 * result + getOrbitAltitude();
        return result;
    }
}
