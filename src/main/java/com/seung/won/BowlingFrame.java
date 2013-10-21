package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 8:10
 * To change this template use File | Settings | File Templates.
 */
public class BowlingFrame {
    int[] droppedPins;
    int rollCnt;

    public BowlingFrame() {
        this.droppedPins = new int[2];
        rollCnt = 0;
    }
    public void roll(int pins) {
        this.droppedPins[rollCnt] = pins;
        rollCnt++;
    }

    public int getScore() {
        return droppedPins[0] + droppedPins[1];
    }

    public FrameStatus getStatus() {
        if (rollCnt == 2) {
            if(droppedPins[0] + droppedPins[1])
                return FrameStatus.SPARE;
            else return FrameStatus.NORMAL;
        }
        else {
            if(droppedPins[0] == 10)
                return FrameStatus.STRIKE;
            else return FrameStatus.NORMAL;
        }
    }
}
