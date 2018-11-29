package com.github.muirandy.tcr.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame game = new BowlingGame();

    private void roll(int numberOfRolls, int pinsPerRoll) {
        for (int i = 0; i< numberOfRolls; i++)
            game.roll(pinsPerRoll);
    }

    @Test
    public void gutterGame() {
        roll(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        roll(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    void t() {
        roll(20, 2);
        assertEquals(40, game.score());
    }
}
