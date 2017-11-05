package com.example.marta.music_shop;


/**
 * Created by marta on 04/11/2017.
 */

public class Piano extends Keyboard {
    private int numberOfKeys;


    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    @Override
    public String play() {
        return "Hitting the keys";
    }

    @Override
    public int calculateMarkUp() {
        return 0;
    }
}
