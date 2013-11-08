package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 7.
 * Time: 오후 8:09
 * To change this template use File | Settings | File Templates.
 */
public class ScoreManager {
    BowlingFrame[] frames;
    int frameCnt;

    public ScoreManager() {
        this.frames = new BowlingFrame[12];
        for (int i=0; i<frames.length; i++) {
            frames[i] = new BowlingFrame();
        }
        frameCnt = 0;
    }

    public void putNumberOfDroppedPin(int pNum) {
        frames[frameCnt].setDroppedPins(pNum);
    }

    public int getRemainPin() {
        if (getCurrentStatus() == FrameStatus.DOING)
            return 10 - frames[frameCnt].droppedPins[0];
        else
            return 10;
    }

    public FrameStatus getCurrentStatus() {
        return frames[frameCnt].getStatus();
    }
}
