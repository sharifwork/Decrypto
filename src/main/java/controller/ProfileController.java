package controller;

import model.GameHistory;

import java.util.ArrayList;

public class ProfileController {
    private ArrayList<GameHistory> gameHistories;

    public ArrayList<GameHistory> getGameHistories() {
        return gameHistories;
    }

    public void addGameHistory(GameHistory gameHistory){
        gameHistories.add(gameHistory);
    }
}
