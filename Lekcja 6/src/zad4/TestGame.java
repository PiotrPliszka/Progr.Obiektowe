package zad4;

import java.util.ArrayList;

public class TestGame {
    static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new StrategyGame());
        games.add(new AdventureGame());
        games.add(new StrategyGame());
        games.add(new AdventureGame());
        games.add(new StrategyGame());

        for(Game g: games){
            System.out.println("Rating: " + g.getRating());
        }
    }
}
