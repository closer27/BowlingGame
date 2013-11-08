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
    FrameStatus frameStatus;

    public BowlingFrame() {
        this.droppedPins = new int[2];
        rollCnt = 0;
        frameStatus = FrameStatus.READY;
    }

    public void setDroppedPins(int pins) {
        droppedPins[rollCnt] = pins;
        rollCnt++;

        setStatus();
    }

    private void setStatus() {
        if (rollCnt == 2) {
            if(droppedPins[0] + droppedPins[1] == 10)
                frameStatus = FrameStatus.SPARE;
            else frameStatus = FrameStatus.OPEN;
        }
        else if (rollCnt == 1) {
            if(droppedPins[0] == 10)
                frameStatus = FrameStatus.STRIKE;
            else frameStatus = FrameStatus.DOING;
        }
        else frameStatus = FrameStatus.READY;
    }

    public FrameStatus getStatus() {
        return frameStatus;
    }
}
