package satellitemanagement;

public class TestSatelliteMission {
    static void main(String[] args) {
        SatelliteSpecs s1 = new SatelliteSpecs("X", 2025, 100);
        SatelliteMission m1 = new SatelliteMission("Mars Conquare", s1, 200);
        SatelliteMission m11 = new SatelliteMission("Mars Conquare", s1, 200);
        SatelliteMission m2 = new SatelliteMission("Moon Conquare", s1, 200);
        System.out.println(m1);
        System.out.println(m1.equals(m11));
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m11.hashCode());
        System.out.println(m2.hashCode());

    }
}
