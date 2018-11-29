package com.github.muirandy.tcr.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame game = new BowlingGame();

    @Test
    public void gutterGame() {
        roll(20, 0);
        assertEquals(0, game.score());
    }

    private void roll(int numberOfRolls, int pinsPerRoll) {
        for (int i = 0; i< numberOfRolls; i++)
            game.roll(pinsPerRoll);
    }

}
