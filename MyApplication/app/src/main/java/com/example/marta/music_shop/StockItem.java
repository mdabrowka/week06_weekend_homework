package com.example.marta.music_shop;

/**
 * Created by marta on 05/11/2017.
 */

public abstract class StockItem implements Sellable{
    private int buyPrice;
    private int sellPrice;

    public StockItem(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    @Override
    public int calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
