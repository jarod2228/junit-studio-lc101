package test;
import org.junit.Test;
import main.BalancedBrackets;
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
    public void unbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void balancedBracketsWithTextInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Text]"));
    }

    @Test
    public void unbalancedBracketsWithTextInsideReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Text]"));
    }

    @Test
    public void unbalancedBracketsWithTextOutsideReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("ejf[[]"));
    }

    @Test
    public void balancedBracketsWithTextOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("ejf[]"));
    }

    @Test
    public void balancedBracketsWithBracketsOutOfOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
