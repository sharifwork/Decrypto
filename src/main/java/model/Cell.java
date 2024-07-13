package model;

public class Cell {
    private final String author;
    private final Row[] rows = new Row[3];
    private int score;

    public Cell(String author) {
        this.author = author;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public Row[] getRows() {
        return rows;
    }

    public int getScore() {
        return score;
    }
}
