package com.seung.won;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Test case for Game.
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:17
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {
    @Test
    public void testCheckScore() {
        Game game = new Game();
        game.scoreManager.putNumberOfDroppedPin(game.roll());

        Assert.assertEquals(FrameStatus.DOING, game.scoreManager.getCurrentStatus());
    }
}
