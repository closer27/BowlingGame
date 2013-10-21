package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 8:10
 * To change this template use File | Settings | File Templates.
 */
public class BowlingFrame {
    int[] rollScore;
    int currentRoll;

    public BowlingFrame() {
        this.rollScore = new int[2];
        currentRoll = 0;
    }
    public void roll(int pins) {
        this.rollScore[currentRoll] = pins;
        currentRoll++;
    }

    public int getScore() {
        return rollScore[0] + rollScore[1];
    }
}
