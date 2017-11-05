package com.example.marta.music_shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;


/**
 * Created by marta on 05/11/2017.
 */

public class TromboneTest {
    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone(300, 700, "bass");
    }


    @Test
    public void play() {
        assertEquals("Transforming the air into sound", trombone.play());
    }

    @Test
    public void getType() {
        assertEquals("bass", trombone.getType());


    }

}
