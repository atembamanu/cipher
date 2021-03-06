package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void isString_userInputIsString_true(){
        Encoding encoding = new Encoding("hello", 0);
        assertTrue(encoding.isString());
    }

    @Test
    public void getUserInputtedString_getTheStringWhichUserEntered_Hello() {
        Encoding encoding = new Encoding("Hello", 0);
        assertEquals("Hello", encoding.getUserInputtedString());
    }

    @Test
    public void startEncryption_convertUserStringToCipherTextBy20_BC() {
        Encoding encoding = new Encoding("HI", 20);
        assertEquals("BC", encoding.startEncryption());
    }


}