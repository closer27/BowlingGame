package com.seung.won;

/**
 * 볼링 게임 진행 클래스
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:25
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    int[] droppedPins;
    private int currentRoll;
    private boolean isSpare = false;

    public Game() {
        droppedPins = new int[22];
        currentRoll = 0;
    }

    public void roll(int pin) {
        droppedPins[currentRoll] = pin;
        currentRoll++;
    }

    public int getCurrentScore() {
        int score = 0;
//        for (int i=0; i<currentRoll; i++) {
//            score += droppedPins[i];
//        }

        for (int i=0; i<currentRoll; i++) {
            if(i%2 == 0) { // 한 레일의 첫번째 롤
                score += droppedPins[i];
            }
            else {  // 두번째 롤
                score += droppedPins[i];
                if (droppedPins[i-1]+droppedPins[i] == 10) {
                    score += droppedPins[i+1];
                }
            }
        }
        return score;
    }
}
