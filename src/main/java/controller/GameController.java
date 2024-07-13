package controller;

import model.Team;
import utlls.Result;
import utlls.Util;

public class GameController {

    private Team team1;
    private Team team2;
    private boolean isTeam1Turn ;
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

    private void assigningRandomTurn(){
        boolean random = Util.getRandom().nextBoolean();
        isTeam1Turn = random;
    }

    public Result typeCodeInCell(int index , String code){
        if(index<0 || index>2)return new Result(false , "index is out of bound");

        getTeamThisRound().getBoard().get(getTeamThisRound().getBoard().size()-1).getRows()[index].setCode(code);
        return new Result(true , "your code has set successfully");
    }

    private Team getTeamThisRound(){
        if(isTeam1Turn) return team1;
        else return team2;
    }

    private Team getTeamNextRound(){
        if(isTeam1Turn) return team2;
        else  return team1;
    }

    public void changeTurn(){
        if(isTeam1Turn) isTeam1Turn=false;
        else isTeam1Turn = true;
    }

    private Result processAfterRound(){

    }

    public Result chooseNumCodeInCell(int index , int number){
        if(index<0 || index>2) return new Result(false , "index is out of bound");
        if(number<1 || number>4) return new Result(false , "your numCode is invalid");

        getTeamThisRound().getBoard().get(getTeamThisRound().getBoard().size()-1).getRows()[index].setGuess(number);
        return new Result(true , "your numCode has set successfully");
    }

    public Result typeGuessWordInColumn(int index,String guess){
        if(index<0 || index>3) return new Result(false , "index is out of bound");
        if(!Util.isMatchStringWithRegex(guess ,"[A-Za-z ]+")) return new Result(false ,"your input is invalid");

        getTeamThisRound().getColumns()[index].getCodes().add(guess);
        return new Result(true, "word inserted successfully");
    }

    public Result processGameOver(){

    }


}
