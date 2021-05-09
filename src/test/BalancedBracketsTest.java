package test;
import org.junit.Test;
import main.BalancedBrackets;

import javax.sql.rowset.BaseRowSet;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void initTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringsInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Burritos]"));
    }

    @Test
    public void stringAndBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Tacos"));
    }

    @Test
    public void twoSetsBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Burritos[]"));
    }

    @Test
    public void nestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Burritos]]"));
    }

    @Test
    public void reverseOnlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyLeftBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Burritots"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void mismatchReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Burritos[]"));
    }

    @Test
    public void otherMismatchingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Burritos[]"));
    }
}
