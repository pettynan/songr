package com.tynan.codefellows.songr.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeControllerTest {
    private CapitalizeController init = new CapitalizeController();

    @Test
    public void testCapitalize() {

        String inputString = "HeLlo, ThIs tEsT DoEs woRk";
        String expectedOutput = "HELLO, THIS TEST DOES WORK";


        assertEquals("The capitalize method should return a string equal to the above string",
                expectedOutput,
                init.capitalize(inputString));

    }
}