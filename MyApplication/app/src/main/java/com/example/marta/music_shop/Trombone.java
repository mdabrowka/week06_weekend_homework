package com.example.marta.music_shop;



/**
 * Created by marta on 04/11/2017.
 */

public class Trombone extends Brass {
    private String type;

    public Trombone(int buyPrice, int sellPrice, String type) {
        super(buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String play() {
        return "Transforming the air into sound";
    }

    @Override
    public int calculateMarkUp() {
        return 0;
    }
}
