package com.emtvoinos.studentwork;

import java.util.ArrayList;
import java.util.Collections;


public class BonusMiniGame {

    private ArrayList<String> game;

    public BonusMiniGame() {
        this.game = new ArrayList<>();
        initiate();
        shuffle();
    }

    public void initiate(){
        game.add("Win");
        game.add("Lose");
        game.add("Lose");
    }

    public void shuffle(){
        Collections.shuffle(this.game);
    }

    public String getPosition1(){
        return this.game.get(0);
    }

    public String getPosition2(){
        return this.game.get(1);
    }

    public String getPosition3(){
        return this.game.get(2);
    }

}
