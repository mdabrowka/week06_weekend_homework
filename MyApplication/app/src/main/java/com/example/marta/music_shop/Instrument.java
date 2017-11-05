package com.example.marta.music_shop;

/**
 * Created by marta on 05/11/2017.
 */

public abstract class Instrument extends StockItem implements Playable{
    public Instrument(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }
}
