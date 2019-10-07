package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void isString_userInputIsString_true(){
        Encoding encoding = new Encoding("hello", 0);
        assertTrue(encoding.isString());
    }


}