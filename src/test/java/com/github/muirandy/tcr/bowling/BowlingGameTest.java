package com.github.muirandy.tcr.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    private BowlingGame game = new BowlingGame();

    private void roll(int numberOfRolls, int pinsPerRoll) {
        for (int i = 0; i < numberOfRolls; i++)
            game.roll(pinsPerRoll);
    }

    private void rollSpare() {
        roll(1, 6);
        roll(1, 4);
    }

    private void rollStrike() {
        roll(1, 10);
    }

    @Test
    void gutterGame() {
        roll(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    void allOnes() {
        roll(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    void oneSpare() {
        rollSpare();
        roll(1, 2);
        roll(17, 0);
        assertEquals(14, game.score());
    }

    @Test
    public void oneStrike() {
        rollStrike();
        roll(1, 2);
        roll(1, 3);
        roll(16, 0);
        assertEquals(20, game.score());
    }

    @Test
    public void perfectGame() {
        roll(12, 10);
        assertEquals(300, game.score());
    }
}
