package com.example.user.darts;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by user on 07/11/2016.
 */

public class RankingsTest {

    Rankings rankings;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    @Before
    public void before() {
        player1 = new Player("Ross", "Rlog");
        player2 = new Player("Randy", "Viper");
        player3 = new Player("Seth", "Architect");
        player4 = new Player("Paul", "Show");
        player5 = new Player("Jim", "Warrior");
        player6 = new Player("Kane", "Demon");
        player7 = new Player("Shawn", "Showstopper");
        player8 = new Player("Dolph", "Showstealer");
        player9 = new Player("Dwayne", "Rock");
        player10 = new Player("Bret", "Hitman");
    }

    @Test public void rankingCount() {
        rankings.add(player1)
        assertEquals(1, rankings.size())
    }
}
