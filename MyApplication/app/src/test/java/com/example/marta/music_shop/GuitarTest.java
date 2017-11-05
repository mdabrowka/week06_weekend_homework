package com.example.marta.music_shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by marta on 04/11/2017.
 */

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(20, 10, 5, "acoustic");
    }


    @Test
    public void getNumberOfStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void getType() {
        assertEquals("acoustic", guitar.getType());
    }

}
