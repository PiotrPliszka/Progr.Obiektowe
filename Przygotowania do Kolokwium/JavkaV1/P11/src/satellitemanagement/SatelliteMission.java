package satellitemanagement;

import java.util.Objects;

public class SatelliteMission {
    private String missionName;
    private SatelliteSpecs specs;
    private int operatingHours;

    public SatelliteMission(String missionName, SatelliteSpecs specs, int operatingHours) {
        setMissionName(missionName);
        setSpecs(specs);
        setOperatingHours(operatingHours);
    }

    public void setMissionName(String missionName) {
        if (missionName == null){
            this.missionName = "";
        }
        else{
            this.missionName = missionName;
        }
    }

    public void setSpecs(SatelliteSpecs specs) {
        if (specs == null){
            this.specs = new SatelliteSpecs("", 0, 0);
        }
        else{
            this.specs = new SatelliteSpecs(specs);
        }
    }

    public void setOperatingHours(int operatingHours) {
        if (operatingHours < 0){
            this.operatingHours = 0;
        }
        else{
            this.operatingHours = operatingHours;
        }
    }

    public String getMissionName() {
        return missionName;
    }

    public SatelliteSpecs getSpecs() {
        return new SatelliteSpecs(this.specs);
    }

    public int getOperatingHours() {
        return operatingHours;
    }

    @Override
    public String toString() {
        return "SatelliteMission{" +
                "missionName='" + missionName + '\'' +
                ", specs=" + specs +
                ", operatingHours=" + operatingHours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        SatelliteMission that = (SatelliteMission) o;
        return getOperatingHours() == that.getOperatingHours() && Objects.equals(getMissionName(), that.getMissionName()) && Objects.equals(getSpecs(), that.getSpecs());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getMissionName());
        result = 31 * result + Objects.hashCode(getSpecs());
        result = 31 * result + getOperatingHours();
        return result;
    }

}
