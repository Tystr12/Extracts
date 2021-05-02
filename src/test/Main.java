package test;

import java.util.ArrayList;

import static test.Game.*;

public class Main {

    public static void main(String[] args) {
        Game g1 = new Game("red dead", 2009, "rockstar");
        Game g2 = new Game("gta v", 2013, "rockstar");
        Game g3 = new Game("world of warcraft", 2004, "blizzard");

        ArrayList<Game> col = new ArrayList<Game>();
        col.add(g1);
        col.add(g2);
        col.add(g3);

        Game g4 = new Game("warzone", 2020, "infinityward");
        Game g5 = new Game("god of war", 2018, "santa monica");
        AddNewGame(col, g4);
        System.out.println(col.size());
        RemoveGame(col, g1);
        System.out.println(col.size());
        System.out.println(col.toString());
        updateGame(col, g2, g5);
        System.out.println(col.toString());
    }




}



