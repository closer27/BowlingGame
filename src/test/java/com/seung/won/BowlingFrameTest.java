package com.seung.won;

import org.junit.Assert;
import org.junit.Test;

/**
 * 각 프레임의 정보를 갖고 처리하는 클래스
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 8:06
 * To change this template use File | Settings | File Templates.
 */
public class BowlingFrameTest {
    @Test
    public void testRoll() {
        BowlingFrame frame = new BowlingFrame();
        frame.roll(5);
        frame.roll(5);

        Assert.assertEquals(frame.getScore(), 10);
    }
}
