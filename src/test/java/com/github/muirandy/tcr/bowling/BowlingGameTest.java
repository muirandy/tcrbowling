package com.github.muirandy.tcr.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        roll(20, 0);
        assertEquals(0, game.score());
    }

    private void roll(int numberOfRolls, int pinsPerRoll) {
    }

}
