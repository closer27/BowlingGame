package com.seung.won;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 7.
 * Time: 오후 8:09
 * To change this template use File | Settings | File Templates.
 */
public class ScoreManagerTest {
    @Test
    public void printScore() {
        ScoreManager scoreManager = new ScoreManager();

        scoreManager.putNumberOfDroppedPin(4);
        scoreManager.putNumberOfDroppedPin(6);
        scoreManager.putNumberOfDroppedPin(5);
        scoreManager.putNumberOfDroppedPin(3);
        scoreManager.putNumberOfDroppedPin(2);

        Assert.assertEquals(FrameStatus.DOING, scoreManager.getCurrentStatus());
        Assert.assertEquals(23, scoreManager.getTotalScore());   // 0번 프레임 점수
    }

    @Test
    public void StrikeStatusTest() {
        ScoreManager scoreManager = new ScoreManager();

        scoreManager.putNumberOfDroppedPin(10);
        scoreManager.putNumberOfDroppedPin(2);

        Assert.assertEquals(FrameStatus.DOING, scoreManager.getCurrentStatus());
    }

    @Test
    public void doubleStrikeScore() {
        ScoreManager scoreManager = new ScoreManager();

        scoreManager.putNumberOfDroppedPin(10);
        scoreManager.putNumberOfDroppedPin(10);
        scoreManager.putNumberOfDroppedPin(2);

        Assert.assertEquals(FrameStatus.DOING, scoreManager.getCurrentStatus());
        Assert.assertEquals(22, scoreManager.getScore(0));
        Assert.assertEquals(12, scoreManager.getScore(1));
        Assert.assertEquals(34, scoreManager.getTotalScore());
    }

    @Test
    public void strikeSpare() {
        ScoreManager scoreManager = new ScoreManager();

        scoreManager.putNumberOfDroppedPin(10);
        scoreManager.putNumberOfDroppedPin(3);
        scoreManager.putNumberOfDroppedPin(7);
        scoreManager.putNumberOfDroppedPin(3);

        Assert.assertEquals(FrameStatus.DOING, scoreManager.getCurrentStatus());
        Assert.assertEquals(23, scoreManager.getScore(0));
        Assert.assertEquals(13, scoreManager.getScore(1));
        Assert.assertEquals(36, scoreManager.getTotalScore());
    }
}
