package com.github.codetest.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintServiceTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Before
    public void setUp() throws Exception {
        System.out.println(CLASS_NAME + "Start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(CLASS_NAME + "End");
    }

    @Test
    public void printNumberAsList_1() {
        log.clearLog();
        HashMap<Integer,String> numberMap = new HashMap<Integer, String>();
        numberMap.put(3,"Fizz");
        numberMap.put(5,"Buzz");
        Integer startVal = 13;
        Integer endVal = 13;
        String expectedVal = "Fizz";
        PrintService.printNumberAsList(startVal,endVal,numberMap);
        assertThat(log.getLog().replaceAll("\r|\n",""),is(expectedVal));
    }

    @Test
    public void printNumberAsList_2() {
        log.clearLog();
        HashMap<Integer,String> numberMap = new HashMap<Integer, String>();
        numberMap.put(3,"Fizz");
        numberMap.put(5,"Buzz");
        Integer startVal = 15;
        Integer endVal = 15;
        String expectedVal = "FizzBuzz";
        PrintService.printNumberAsList(startVal,endVal,numberMap);
        assertThat(log.getLog().replaceAll("\r|\n",""),is(expectedVal));
    }

    @Test
    public void printNumberAsList_3() {
        log.clearLog();
        HashMap<Integer,String> numberMap = new HashMap<Integer, String>();
        numberMap.put(3,"Fizz");
        numberMap.put(5,"Buzz");
        Integer startVal = 13;
        Integer endVal = 15;
        String expectedVal = "Fizz14FizzBuzz";
        PrintService.printNumberAsList(startVal,endVal,numberMap);
        assertThat(log.getLog().replaceAll("\r|\n",""),is(expectedVal));
    }

    private final String CLASS_NAME = "PrintService Unit Test ";
}