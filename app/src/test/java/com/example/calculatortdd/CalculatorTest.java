package com.example.calculatortdd;

import junit.framework.TestCase;

import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testPress() {
        Calculator c = new Calculator();
        c.press("3");
        assertEquals("3", c.display);
    }

    @Test
    public void testPressTwoButtons() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("2");
        assertEquals("32", c.display);
    }

    @Test
    public void testPressThreeButtons() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("2");
        c.press("3");
        assertEquals("323", c.display);
    }

    @Test
    public void testPressTwoButtonAndPlus() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("2");
        c.press("+");
        assertEquals("0", c.display);
    }
    @Test
    public void testPressOnePlusTwo() {
        Calculator c = new Calculator();
        c.press("1");
        c.press("+");
        c.press("2");
        assertEquals("2", c.display);
    }
    @Test
    public void testPressOnePlusTwoEqualsThree() {
        Calculator c = new Calculator();
        c.press("1");
        c.press("+");
        c.press("2");
        c.press("=");
        assertEquals("3", c.display);
    }
    @Test
    public void testPressThreeMinusTwoEqualsOne() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("-");
        c.press("2");
        c.press("=");
        assertEquals("1", c.display);
    }
    @Test
    public void testPressTwoTimesTwo(){
        Calculator c = new Calculator();
        c.press("2");
        c.press("*");
        c.press("2");
        c.press("=");
        assertEquals("4", c.display);
    }
    @Test
    public void testPressTwoDividedByTwo(){
        Calculator c = new Calculator();
        c.press("2");
        c.press("/");
        c.press("2");
        c.press("=");
        assertEquals("1", c.display);
    }
    @Test
    public void testPressThreePlusPlus() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("+");
        c.press("+");
        assertEquals("0", c.display);
    }
    @Test
    public void testPressOnePlusTwoPlusThreeEquals() {
        Calculator c = new Calculator();
        c.press("1");
        c.press("+");
        c.press("2");
        c.press("+");
        c.press("3");
        c.press("=");
        assertEquals("6", c.display);
    }

    @Test
    public void testClearDisplay() {
        Calculator c = new Calculator();
        c.press("3");
        c.press("c");
        assertEquals("0", c.display);
    }

    @Test
    public void testTwoPointThreeDisplay() {
        Calculator c = new Calculator();
        c.press("2");
        c.press(".");
        c.press("3");
        assertEquals("2.3", c.display);
    }

    @Test
    public void testFiveDividedByTwoDisplay() {
        Calculator c = new Calculator();
        c.press("5");
        c.press("/");
        c.press("2");
        c.press("=");
        assertEquals("2.5", c.display);
    }

}