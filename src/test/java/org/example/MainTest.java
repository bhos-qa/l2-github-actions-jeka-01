package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testStringLength(){
        assertEquals("Length of the word 'test' is 4", Main.stringLength("test"));
    }
}