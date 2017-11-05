package com.example.marta.music_shop;

/**
 * Created by marta on 04/11/2017.
 */

public abstract class StringInstrument extends Instrument {

    public StringInstrument(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }


    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }


}
