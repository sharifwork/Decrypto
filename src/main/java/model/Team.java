package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<String> players;
    private ArrayList<Cell> board;
    private ArrayList<Cell> enemyBoard;
    private final String [] words = new String[4];
    private Column[] columns = new Column[4];
    private int score;

    public Team(String name, ArrayList<String> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public ArrayList<Cell> getBoard() {
        return board;
    }

    public ArrayList<Cell> getEnemyBoard() {
        return enemyBoard;
    }

    public String[] getWords() {
        return words;
    }

    public Column[] getColumns() {
        return columns;
    }

    public int getScore() {
        return score;
    }
}
