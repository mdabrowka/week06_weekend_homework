package com.example.marta.music_shop;

import java.util.ArrayList;

/**
 * Created by marta on 05/11/2017.
 */

public class Shop {

   public ArrayList<Sellable> stock;


    public Shop() {
        this.stock = new ArrayList<Sellable>();
    }


    public int stockSize() {
        return stock.size();
    }

    public void addToStock(Sellable item) {
        stock.add(item);
    }

    public void deleteFromStock(Sellable item) {
        stock.remove(item);
    }


}
