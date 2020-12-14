package com.example.mipt_pd5;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void Given_Null_To_Parser_Result_is_null(){
        final String givenString = null;

        final String expectedResult = null;
        final String actualResult = Parser.parseData(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_EmptyString_To_Parser_Result_is_null(){
        final String givenString = "";

        final String expectedResult = null;
        final String actualResult = Parser.parseData(givenString);

        assertEquals(expectedResult, actualResult);
    }
}