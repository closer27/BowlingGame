package com.seung.won;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Game.
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:17
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {
    @Test
    public void testRoll() {
        Game game = new Game();
        game.roll(0);
        game.roll(0);
        game.roll(0);

        Assert.assertEquals(game.getCurrentScore(), 0);
    }
}
