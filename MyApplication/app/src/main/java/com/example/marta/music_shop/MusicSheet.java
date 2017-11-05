package com.example.marta.music_shop;

/**
 * Created by marta on 05/11/2017.
 */

public class MusicSheet extends Printed {
    public String title;
    public String composer;

    public MusicSheet(String title, String composer, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.title = title;
        this.composer = composer;
    }

    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }


}