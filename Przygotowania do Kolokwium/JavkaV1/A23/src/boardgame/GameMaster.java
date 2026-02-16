package boardgame;

import java.util.Arrays;

public class GameMaster implements Cloneable{
    private String name;
    private double[] playersScores;

    public GameMaster(String name, double[] playersScores) {
        this.name = name;
        this.playersScores = playersScores;
    }

    @Override
    public GameMaster clone() {
        try {
            GameMaster clone = (GameMaster) super.clone();
            clone.playersScores = this.playersScores.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "GameMaster{" +
                "name='" + name + '\'' +
                ", playersScores=" + Arrays.toString(playersScores) +
                '}';
    }

    static void main() {
        GameMaster g1 = new GameMaster("Piotr", new double[]{2.0, 5.0, 1.0});
        GameMaster g2 = g1.clone();
        System.out.println(g1);
        System.out.println(g2);
        g2.playersScores[0] = 10.5;
        System.out.println(g1);
        System.out.println(g2);
    }
}
