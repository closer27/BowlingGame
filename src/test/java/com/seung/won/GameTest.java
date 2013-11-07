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
    public void testFirstFrame() {
        Game game = new Game();
        game.getCurrentFrame().roll(9);
        game.getCurrentFrame().roll(1);
        game.addFrame();
        game.getCurrentFrame().roll(8);
        game.getCurrentFrame().roll(0);
        game.addFrame();
        game.getCurrentFrame().roll(10);
        game.getCurrentFrame().roll(0);
        game.addFrame();
        game.getCurrentFrame().roll(10);
        game.getCurrentFrame().roll(0);
        game.addFrame();
        game.getCurrentFrame().roll(8);
        game.getCurrentFrame().roll(0);
        game.addFrame();
        game.getCurrentFrame().roll(10);
        game.getCurrentFrame().roll(0);
        game.addFrame();
        game.getCurrentFrame().roll(8);
        game.getCurrentFrame().roll(1);
        game.addFrame();
        game.getCurrentFrame().roll(9);
        game.getCurrentFrame().roll(1);
        game.addFrame();
        game.getCurrentFrame().roll(8);
        game.getCurrentFrame().roll(1);
        game.addFrame();
        game.getCurrentFrame().roll(10);
        game.getCurrentFrame().roll(9);
//        game.getCurrentFrame().roll(1);

        Assert.assertEquals(155, game.getCurrentScore());
    }

    @Test
    public void testAddNextFrame() {
        Game game = new Game();

        Assert.assertEquals(0, game.getCurrentFrameNumber());
    }
//
//    @Test
//    public void testTenthFrame() {
//        Game game = new Game();
//        Random random = new Random(System.nanoTime());
//        for (int i=0; i<9; i++) {
//            game.getCurrentFrame().roll(random.nextInt(6)); // 0 ~ 5
//            game.getCurrentFrame().roll(random.nextInt(6));
//            game.addFrame();
//        }
//        game.getCurrentFrame().roll(4);
//        game.getCurrentFrame().roll(6);
//        game.getCurrentFrame().roll(7);
//
//        Assert.assertEquals(10, game.getCurrentFrameNumber());
//    }
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
