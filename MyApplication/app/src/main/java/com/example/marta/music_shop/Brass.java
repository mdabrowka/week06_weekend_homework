package com.example.marta.music_shop;

/**
 * Created by marta on 04/11/2017.
 */

public abstract class Brass extends Instrument {

    public Brass(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }

    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }

}
