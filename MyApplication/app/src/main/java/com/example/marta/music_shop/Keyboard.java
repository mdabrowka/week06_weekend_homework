package com.example.marta.music_shop;

/**
 * Created by marta on 04/11/2017.
 */

public abstract class Keyboard extends Instrument {

    public Keyboard(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }

    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }

}
