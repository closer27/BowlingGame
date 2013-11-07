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
    FrameStatus prevFrameStatus;

    public BowlingFrame() {
        prevFrameStatus = FrameStatus.NORMAL;

        this.droppedPins = new int[2];
        rollCnt = 0;
    }

    public BowlingFrame(FrameStatus frameStatus) {
        prevFrameStatus = frameStatus;

        this.droppedPins = new int[2];
        rollCnt = 0;
    }

    public void roll(int pins) {
        this.droppedPins[rollCnt] = pins;
        rollCnt++;
    }

    public int getScore() {
        if(prevFrameStatus.equals(FrameStatus.STRIKE)) {
            return (droppedPins[0] + droppedPins[1]) * 2;
        }
        else if(prevFrameStatus.equals(FrameStatus.SPARE)) {
            return droppedPins[0] * 2 + droppedPins[1] ;
        }
        else {
            return droppedPins[0] + droppedPins[1];
        }
    }

    public FrameStatus getStatus() {
        if (rollCnt == 2) {
            if(droppedPins[0] + droppedPins[1] == 10)
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
