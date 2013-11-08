package com.seung.won;

import java.util.ArrayList;
import java.util.Random;

/**
 * 볼링 게임 진행 클래스
 * User: seung-wongim
 * Date: 13. 10. 21.
 * Time: 오후 7:25
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    ScoreManager scoreManager;

    public Game() {
        scoreManager = new ScoreManager();
    }

    public int roll() {
        // second shot 던지기 전에 상태 확인해서 개수 판단
        Random random = new Random(System.nanoTime());
        int remainder = scoreManager.getRemainPin();

        if (remainder == 10)
            return random.nextInt(11);
        else
            return random.nextInt(remainder+1);
    }

}
