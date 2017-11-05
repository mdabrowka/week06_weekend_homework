package com.example.marta.music_shop;



/**
 * Created by marta on 04/11/2017.
 */

public class Guitar extends StringInstrument {
   private int numberOfStrings;
    private String type;


    public Guitar(int buyPrice, int sellPrice, int numberOfStrings, String type) {
        super(buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public String play() {
        return "Creating vibrations";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    @Override
    public int calculateMarkUp() {
        int markUp = sellPrice - buyPrice;
        return markUp;
    }
}
