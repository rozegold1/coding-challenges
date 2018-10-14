import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationIsPalindromeTest {
    
    private PermutationIsPalindrome p;

    @Test
    public void permutationWithOddNumberOfCharsTest() {
        final boolean result = p.hasPalindromePermutation("aabcbcd");
        assertTrue(result);
    }

    @Test
    public void permutationWithEvenNumberOfCharsTest() {
        final boolean result = p.hasPalindromePermutation("aabccbdd");
        assertTrue(result);
    }

    @Test
    public void noPermutationWithOddNumberOfChars() {
        final boolean result = p.hasPalindromePermutation("aabcd");
        assertFalse(result);
    }

    @Test
    public void noPermutationWithEvenNumberOfCharsTest() {
        final boolean result = p.hasPalindromePermutation("aabbcd");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = p.hasPalindromePermutation("");
        assertTrue(result);
    }

    @Test
    public void oneCharacterStringTest() {
        final boolean result = p.hasPalindromePermutation("a");
        assertTrue(result);
    }

}