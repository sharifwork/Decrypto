package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<String> players;
    private ArrayList<Cell> cells;
    private ArrayList<Cell> enemyCells;
    private final String [] words = new String[4];
    private Column[] columns = new Column[4];
    private int score;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public ArrayList<Cell> getEnemyBoard() {
        return enemyCells;
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

    public Cell getMyLastCell(){
        return cells.get(cells.size()-1);
    }

    public Cell getEnemyLastCell(){
        return enemyCells.get(enemyCells.size()-1);
    }
}
