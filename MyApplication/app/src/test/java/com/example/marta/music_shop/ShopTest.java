package com.example.marta.music_shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by marta on 05/11/2017.
 */

public class ShopTest {
    Shop shop;
    Guitar guitar;
    MusicSheet musicSheet;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(20, 40, 6, "acoustic");
        musicSheet = new MusicSheet("Magic Flute", "Mozart", 6, 3);
    }


    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.stockSize());
    }

    @Test
    public void canDeleteFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(musicSheet);
        shop.deleteFromStock(guitar);
        assertEquals(1, shop.stockSize());
    }

}
