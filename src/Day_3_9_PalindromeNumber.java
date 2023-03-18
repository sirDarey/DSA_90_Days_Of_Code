/***
 * 
 * @author Sir Darey
 * 
 * Day 3: Leetcode Problem 9 - Palindrome Number
 *
 */


public class Day_3_9_PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        int initial = x;
        long reversed = 0;
        while (x > 0) {
            reversed = (10*reversed) + x%10;
            x /= 10;
        }
        
        return (int)reversed == initial;
    }
}
