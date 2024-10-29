import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();

        // Test case 1: Palindrome number
        assertTrue(palindrome.isPalindrome(454));

        // Test case 3: Single-digit palindrome
        assertTrue(palindrome.isPalindrome(75));

       
    }
}
