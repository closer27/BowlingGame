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
    public void testFirstFrame() {
        Game game = new Game();
        game.frameArrayList.add(new BowlingFrame(FrameStatus.NORMAL));
        game.frameArrayList.get(0).roll(5);
        game.frameArrayList.get(0).roll(4);

        Assert.assertEquals(game.getCurrentScore(), 9);
    }
//
//    @Test
//    public void testNumberRoll() {
//        Game game = new Game();
//        game.roll(2);
//        game.roll(8);
//        game.roll(5);
//        game.roll(3);
//
//        Assert.assertEquals(game.getCurrentScore(), 23);
//    }
//
//    @Test
//    public void testStrikeFrame() {
//        Game game = new Game();
//        game.roll(10);
//        game.roll(2);
//        game.roll(4);
//
//        Assert.assertEquals(game.getCurrentScore(), 22);
//    }
}
