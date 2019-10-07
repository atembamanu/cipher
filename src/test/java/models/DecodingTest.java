package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void isString_userInputIsString_true(){
        Decoding decoding = new Decoding("JKH", 0);
        assertTrue(decoding.isString());
    }

    @Test
    public void startDecryption_convertCipherUserStringBy20_HI() {
        Decoding decoding = new Decoding("BC", 20);
        assertEquals("HI", decoding.startDecryption());

    }

}