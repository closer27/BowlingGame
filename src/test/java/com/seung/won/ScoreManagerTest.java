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
        scoreManager.putNumberOfDroppedPin(5);

        Assert.assertEquals(FrameStatus.OPEN, scoreManager.getCurrentStatus());
    }
}
