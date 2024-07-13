package controller;

import model.Team;
import utlls.Result;

public class GameController {

    private Team team1;
    private Team team2;
    private int roundTime;
    private int roundNumber;

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(int roundTime) {
        this.roundTime = roundTime;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public Result gameSetup (){

    }

    public Result assigningRandomTurn(){

    }

    public Result typeCodeInCell(int index , String code){

    }

    private Result processAfterRound(){

    }

    public Result chooseNumCodeInCell(int index , int number){

    }

    public Result typeGuessWordInColumn(int index,String guess){

    }

    public Result processGameOver(){

    }


}
