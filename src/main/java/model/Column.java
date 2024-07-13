package model;

import java.util.ArrayList;

public class Column {
    private String answer;
    private ArrayList<String> codes;
    private String guess;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public ArrayList<String> getCodes() {
        return codes;
    }
}
