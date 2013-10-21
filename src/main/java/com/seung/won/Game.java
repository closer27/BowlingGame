package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:25
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    int[] droppedPins;
    private int currentRoll;

    public Game() {
        droppedPins = new int[22];
        currentRoll = 0;
    }

    public void roll(int pin) {
        droppedPins[currentRoll] = pin;
    }

    public int getCurrentScore() {
        int score = 0;
        for (int i=0; i<currentRoll; i++) {
            score += droppedPins[i];
        }
        return score;
    }
}
