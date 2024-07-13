package controller;

import model.Team;
import utlls.Result;
import utlls.Util;

import java.util.ArrayList;

public class PregameController {
    private boolean isTeam1Turn = true;
    private GameController gameController;

    public PregameController(GameController gameController) {
        this.gameController = gameController;
    }

    public void setTeamName(String name){
        getTeamThisTurn().setName(name);
    }

    public void changeTurn() {
        if (isTeam1Turn) isTeam1Turn = false;
        else isTeam1Turn = true;

    }
//    public Result startGame(){
//
//    }

    public Team getTeamThisTurn(){
        if(isTeam1Turn) return gameController.getTeam1();
        else return gameController.getTeam2();
    }

    public Result setWord(int index , String word){
        if(index <0 || index >3 ) return new Result(false , "index is out of bound!");
        if(!Util.isMatchStringWithRegex(word , "[A-Za-z ]+")) return new Result(false , "your input word is invalid");

        getTeamThisTurn().getWords()[index] = word;
        return new Result(true , "set word successfully");
    }

    public Result setTimeEveryRound(int time){
        if(time < 0) return new Result(false , "time can not be less than 0 !");

        gameController.setRoundTime(time);
        return new Result(true, "time of each round set successfully");
    }

    public Result setRoundNumber(int round){
        if(round < 0) return new Result(false , "round can not be less than 1 !");

        gameController.setRoundNumber(round);
        return new Result(true , "number of rounds set successfully");
    }

    public Result addNewPlayer(String player){
        if(!Util.isMatchStringWithRegex(player , "[A-Za-z ]+")) return new Result(false , "player's name is invalid");

        getTeamThisTurn().getPlayers().add(player);
        return new Result(true , "this player added successfully");
    }

    public Result removePlayer(int index){
        ArrayList<String> players = getTeamThisTurn().getPlayers();
        if(index <0 || index>players.size()-1) return new Result(false , "index is out of bound!");

        players.remove(index);
        return new Result(true , "player from players removed successfully");
    }


}
