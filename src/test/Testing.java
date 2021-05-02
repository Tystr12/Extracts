package test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void searchGameTest() {
        Game test = new Game();
        ArrayList<Game> list = new ArrayList<Game>();
        Game g = new Game("cod", 2007, "IW");
        list.add(g);
        Game output = test.search(list, g);
        assertEquals(g, output);
    }
    @Test
    public void updatePreExistingGame() {
        Game test = new Game();
        ArrayList<Game> list = new ArrayList<Game>();
        Game g = new Game("cod", 2007, "IW");
        list.add(g);
        Game nGame = new Game("red dead", 2009, "rockstar");
        Game output = test.updateGame(list, g, nGame);
        assertEquals(nGame, output);
    }
}
