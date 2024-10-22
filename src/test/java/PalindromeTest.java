import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();

        // Test case 1: Palindrome number
        assertTrue(palindrome.isPalindrome(454));

        // Test case 2: Non-palindrome number
        assertFalse(palindrome.isPalindrome(123));

        // Test case 3: Single-digit palindrome
        assertTrue(palindrome.isPalindrome(7));

        // Test case 4: Large palindrome number
        assertTrue(palindrome.isPalindrome(12321));

        // Test case 5: Large non-palindrome number
        assertFalse(palindrome.isPalindrome(98765));

        // Test case 6: Two-digit palindrome
        assertTrue(palindrome.isPalindrome(88));

        // Test case 7: Two-digit non-palindrome
        assertFalse(palindrome.isPalindrome(34));
    }
}
