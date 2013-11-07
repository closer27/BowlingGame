package com.seung.won;

import java.util.ArrayList;

/**
 * 볼링 게임 진행 클래스
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:25
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    ArrayList<BowlingFrame> frameArrayList;
    private int currentFrame;

    public Game() {
        frameArrayList = new ArrayList<BowlingFrame>();
        currentFrame = 0;
    }
//
//    public void roll(int pin) {
//        droppedPins[currentRoll] = pin;
//        currentRoll++;
//    }

    public int getCurrentScore() {
        int score = 0;

        for (int i=0; i<frameArrayList.size(); i++) {
            score += frameArrayList.get(i).getScore();
        }
        return score;
    }
}
