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
    }

    public void roll(int pins) {
        if (rollCnt < 2) {
            this.droppedPins[rollCnt] = pins;
            rollCnt++;
        }
        else {
            System.out.println("Invalid Request : cannot roll 3 times in 1 frame");
        }

        setStatus();
    }

//    public int getScore() {
//        if(prevFrameStatus.equals(FrameStatus.STRIKE)) {
//            return (droppedPins[0] + droppedPins[1]) * 2;
//        }
//        else if(prevFrameStatus.equals(FrameStatus.SPARE)) {
//            return droppedPins[0] * 2 + droppedPins[1] ;
//        }
//        else {
//            return droppedPins[0] + droppedPins[1];
//        }
//    }

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
