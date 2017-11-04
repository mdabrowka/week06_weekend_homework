package com.example.marta.music_shop;



/**
 * Created by marta on 04/11/2017.
 */

public class Guitar extends StringInstrument {
   private int numberOfStrings;
    private String type;


    public Guitar(int numberOfStrings, String type) {
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String play() {
        return "Creating vibrations";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



}
