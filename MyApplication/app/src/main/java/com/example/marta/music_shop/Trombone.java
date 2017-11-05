package com.example.marta.music_shop;



/**
 * Created by marta on 04/11/2017.
 */

public class Trombone extends Brass {
    private String type;

    public Trombone(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String play() {
        return "Transforming the air into sound";
    }
}
