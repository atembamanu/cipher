package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void isString_userInputIsString_true(){
        Decoding decoding = new Decoding("JKH", 0);
        assertTrue(decoding.isString());
    }

}