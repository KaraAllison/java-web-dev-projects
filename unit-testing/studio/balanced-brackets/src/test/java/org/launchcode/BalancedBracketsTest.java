package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void singleLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void simpleBalance() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }
    @Test
    public void wordEnclosed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }
    @Test
    public void offsetBracketsLeft() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]phrase"));
    }
    @Test
    public void offsetBracketsRight() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[phrase]"));
    }
    @Test
    public void multipleBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[]]"));
    }
    @Test
    public void multipleUnbalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }
    @Test
    public void newLineBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("\n[\n\n[\n]]\n"));
    }
    @Test
    public void newLineUnbalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("\n[\n\n[\n]\n"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}