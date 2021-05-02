package test;

import java.util.ArrayList;

public class Game {
    String name;
    int release;
    String developer;

    public Game() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", developer='" + developer + '\'' +
                '}';
    }

    public Game(String name, int release, String developer) {
        this.name = name;
        this.release = release;
        this.developer = developer;

    }

    public static void AddNewGame(ArrayList<Game> list, Game g) {
        if (doesGameExistsInArrayList(list, g) == false) {
            list.add(g);
        }
    }
    public static boolean doesGameExistsInArrayList(ArrayList<Game> list, Game g) {
        if(list.contains(g)) {
            return true;
        }
        return false;
    }
    public static void RemoveGame(ArrayList<Game> list, Game g) {
        if(doesGameExistsInArrayList(list, g)) {
            list.remove(g);
        }
    }
    public static Game search(ArrayList<Game> list, Game g) {
        Game result = null;
        if(doesGameExistsInArrayList(list, g)) {
            result = list.get(list.indexOf(g));
        }
        return result;
    }
    public static Game updateGame(ArrayList<Game> list, Game oldGame, Game updatedGame) {
        if(doesGameExistsInArrayList(list, oldGame)) {
           list.set(list.indexOf(oldGame), updatedGame);
        }
        return list.get(list.indexOf(updatedGame));
    }
}
