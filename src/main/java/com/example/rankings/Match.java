package com.example.rankings;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;


public class Match implements Serializable {

    private String player1;
    private String player2;
    private int score1;
    private int score2;

    public Match(String player1, String player2, int score1, int score2) {
        super();
        this.player1 = player1;
        this.player2 = player2;
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    public String toString() {
        return "Match [player1=" + player1 + ", player2=" + player2
                + ", score1=" + score1 + ", score2=" + score2 + "]";
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
}
