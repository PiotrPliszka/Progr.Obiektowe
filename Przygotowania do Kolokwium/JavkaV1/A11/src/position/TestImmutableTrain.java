package position;

public class TestImmutableTrain {
    static void main() {
        ImmutableTrain t1 = new ImmutableTrain(10.0, "Shinkansen", 5);
        System.out.println(t1);
        System.out.println("\n");
        ImmutableTrain t2 = t1.move(10.0, "X", 1);
        System.out.println(t2);
    }

}
