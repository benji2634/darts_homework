package com.example.user.darts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Ross", "Rlog");
    }

    @Test
    public void testPlayerSetup() {
        assertEquals("Ross", player.getName());
        assertEquals("Rlog", player.getNickname());
    }

    @Test
    public void canPrintString() {
        assertEquals("Ross (Rlog)", player.toString());
    }

}
