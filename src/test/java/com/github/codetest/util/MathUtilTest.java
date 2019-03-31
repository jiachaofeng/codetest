package com.github.codetest.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {

    @Before
    public void setUp() throws Exception {
        System.out.println(CLASS_NAME + "Start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(CLASS_NAME + "End");
    }

    @Test
    public void isDivisibleByNumber_1() {
        Integer inVal = null;
        Integer number = 3;
        assertFalse(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_2() {
        Integer inVal = 99;
        Integer number = null;
        assertFalse(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_3() {
        Integer inVal = 99;
        Integer number = 3;
        assertTrue(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_4() {
        Integer inVal = 99;
        Integer number = 5;
        assertFalse(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_5() {
        Integer inVal = 99;
        Integer number = 101;
        assertFalse(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_6() {
        Integer inVal = 99;
        Integer number = 0;
        assertFalse(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isDivisibleByNumber_7() {
        Integer inVal = 0;
        Integer number = 3;
        assertTrue(MathUtil.isDivisibleByNumber(inVal,number));
    }

    @Test
    public void isContainsNumber_1() {
        Integer inVal = null;
        Integer number = 3;
        assertFalse(MathUtil.isContainsNumber(inVal,number));
    }

    @Test
    public void isContainsNumber_2() {
        Integer inVal = 99;
        Integer number = null;
        assertFalse(MathUtil.isContainsNumber(inVal,number));
    }

    @Test
    public void isContainsNumber_3() {
        Integer inVal = 99;
        Integer number = 9;
        assertTrue(MathUtil.isContainsNumber(inVal,number));
    }

    @Test
    public void isContainsNumber_4() {
        Integer inVal = 99;
        Integer number = 3;
        assertFalse(MathUtil.isContainsNumber(inVal,number));
    }

    @Test
    public void isContainsNumber_5() {
        Integer inVal = 101;
        Integer number = 0;
        assertTrue(MathUtil.isContainsNumber(inVal,number));
    }

    private final String CLASS_NAME = "MathUtil Unit Test ";
}