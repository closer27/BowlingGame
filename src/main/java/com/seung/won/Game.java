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

    public Game() {
        frameArrayList = new ArrayList<BowlingFrame>(); // create ArrayList of BowlingFrame.
        frameArrayList.add(new BowlingFrame()); // add the first frame of game automatically.
    }

    public int getCurrentScore() {
        // Method to get current score of the game.
        int score = 0;

        for (int i=0; i<frameArrayList.size(); i++) {
            score += frameArrayList.get(i).getScore();
        }
        return score;
    }

    public BowlingFrame getCurrentFrame() {
        return frameArrayList.get(getCurrentFrameNumber());
    }

    public int getCurrentFrameNumber() {
        // Method to get the number of the current frame.
        return frameArrayList.size()-1;
    }

    public void addFrame() {
        // Method to add the new frame of game.
        frameArrayList.add(new BowlingFrame(frameArrayList.get(getCurrentFrameNumber()).getStatus()));
    }
}
