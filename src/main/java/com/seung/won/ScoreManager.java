package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 7.
 * Time: 오후 8:09
 * To change this template use File | Settings | File Templates.
 */
public class ScoreManager {
    BowlingFrame[] frames;  // 각 프레임 배열
    int[] frameScores;  // 각 프레임 점수 배열
    int frameCnt;   // 프레임 카운터

    public ScoreManager() {
        this.frames = new BowlingFrame[12];
        frameScores = new int[12];
        for (int i=0; i<frames.length; i++) {
            frames[i] = new BowlingFrame(); // 생성자 호출
            frameScores[i] = 0; // 0점으로 초기화
        }
        frameCnt = 0;
    }

    public void putNumberOfDroppedPin(int pNum) {
        frames[frameCnt].setDroppedPins(pNum);
        addFrameScore(frameCnt, pNum);

        if (frameCnt != 0) {
            if ((frames[frameCnt-1].getStatus() == FrameStatus.STRIKE ||
                frames[frameCnt-1].getStatus() == FrameStatus.SPARE) &&
                frames[frameCnt].getStatus() == FrameStatus.DOING) {
                addFrameScore(frameCnt-1, pNum);    // 보너스 점수를 이전 프레임에 추가 합한다
            }
            else if (frames[frameCnt-1].getStatus() == FrameStatus.STRIKE &&
                    (frames[frameCnt].getStatus() == FrameStatus.OPEN ||
                    frames[frameCnt].getStatus() == FrameStatus.STRIKE ||
                    frames[frameCnt].getStatus() == FrameStatus.SPARE)) {
                addFrameScore(frameCnt-1, pNum);
            }
        }

        if (frames[frameCnt].getStatus() == FrameStatus.OPEN
            || frames[frameCnt].getStatus() == FrameStatus.SPARE
            || frames[frameCnt].getStatus() == FrameStatus.STRIKE) {
            frameCnt++; // increase frameCnt value if a frame is done.
        }
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

    public void addFrameScore(int frameNum, int score) {
        frameScores[frameNum] += score; // 점수를 추가
    }

    public int getTotalScore() {
        int tatalScore = 0;
        for (int i=0; i<frameCnt; i++) {
            tatalScore += frameScores[i];
        }
        return tatalScore;
    }
}
