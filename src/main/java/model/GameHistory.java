package model;

import java.security.KeyPair;
import java.util.HashMap;

public class GameHistory {
    private Team team1 ;
    private Team team2;

    public GameHistory(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }
}
