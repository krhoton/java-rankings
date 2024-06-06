package com.example.rankings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatchTest {

    @Test
    @DisplayName("Comprueba que contiene la palabra player")
    void toStringContainsPlayer(){
        Match tst = new Match("Aaron", "B", 10,20);
        assertTrue(tst.toString().contains("player1"));
    }

    @Test
    @DisplayName("toString contiene player1")
    void toStringContainsPlayerName(){
        Match tst = new Match("Aaron", "B", 10,20);
        assertTrue(tst.toString().contains("player1=Aaron"));
    }

    @Test
    @DisplayName("toString se formatea correctamente")
    void toStringSucessfullyFormatAllParameters(){
        Match tst = new Match("Aaron", "B", 10,20);
        assertEquals("Match [player1=Aaron, player2=B, score1=10, score2=20]", tst.toString());
    }
}
