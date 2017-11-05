package com.example.marta.music_shop;

/**
 * Created by marta on 05/11/2017.
 */

public abstract class Printed extends Miscellaneous {


    public Printed(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }

    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }


}
