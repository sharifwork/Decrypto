package controller;

import model.Row;
import model.Team;
import utlls.Result;
import utlls.Util;
import view.controller.GameMenuController;

import java.util.ArrayList;

public class GameController {

    private Team team1;
    private Team team2;
    private boolean isTeam1Turn ;
    private int roundTime;
    private int roundNumber;
    private final int[] numCodes = new int[3];
    private GameMenuController view;

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

        getTeamThisRound().getMyLastCell().getRows()[index].setCode(code);
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

    private void processAfterRound(){
        if(isMatchGuessByAnswer(getTeamThisRound())) getTeamThisRound().getMyLastCell().setScore(0);
        else getTeamThisRound().getMyLastCell().setScore(-1);
        if(isMatchGuessByAnswer(getTeamNextRound())) getTeamNextRound().getEnemyLastCell().setScore(1);
        else getTeamNextRound().getEnemyLastCell().setScore(0);
    }

    private boolean isMatchGuessByAnswer(Team team){
        Row[] rows = getTeamThisRound().getMyLastCell().getRows();
        for (int i = 0; i < rows.length; i++) {
            if(rows[i].getGuess() != numCodes[i]) return false;
        }
        return true;
    }


    public Result chooseNumCodeInCell(int index , int number){
        if(index<0 || index>2) return new Result(false , "index is out of bound");
        if(number<1 || number>4) return new Result(false , "your numCodes is invalid");

        getTeamThisRound().getMyLastCell().getRows()[index].setGuess(number);
        return new Result(true , "your numCodes has set successfully");
    }

    public Result typeGuessWordInColumn(int index,String guess){
        if(index<0 || index>3) return new Result(false , "index is out of bound");
        if(!Util.isMatchStringWithRegex(guess ,"[A-Za-z ]+")) return new Result(false ,"your input is invalid");

        getTeamThisRound().getColumns()[index].getCodes().add(guess);
        return new Result(true, "word inserted successfully");
    }

    public Result processGameOver(){

    }

    public int[] getNewNumCode(){
        return numCodes;
    }

    private void generateAndSetNumCode(){
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for (Integer number : numbers) {
            int random = Util.getRandom().nextInt() % 4;
            Util.swapObjectInArrayList(numbers , numbers.indexOf(number) , random );
        }

        for (int i = 0; i < numCodes.length; i++) {
            numCodes[i] = numbers.get(i);
        }
    }
}
