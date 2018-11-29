package com.github.muirandy.tcr.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.score());
    }

}
