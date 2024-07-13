package controller;

import model.Team;
import utills.Result;

public class PregameController {

    private Team team1;
    private Team team2;
    private boolean isTurnTeam1 = true;

    public PregameController(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setTeamName(String name){

    }

    public Result changeTurn(){

    }

    public Result startGame(){

    }

    public Team getTeamThisTurn(){

    }

    public Result setWord(int index , String word){

    }

    public Result setTimeEveryRound(int time){

    }

    public Result setRoundNumber(int round){

    }

    public Result addNewPlayer(String player){

    }

    public Result removePlayer(int index){

    }
}
