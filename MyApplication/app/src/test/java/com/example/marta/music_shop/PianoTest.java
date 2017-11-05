package com.example.marta.music_shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;
/**
 * Created by marta on 05/11/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano(600, 1000, 88);
    }

    @Test
    public void play() {
        assertEquals("Hitting the keys", piano.play());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

}
