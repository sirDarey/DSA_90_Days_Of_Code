/***
 * 
 * @author Sir Darey
 * 
 * Day 48: LeetCode Problem 344 - Reverse String
 *
 */

public class Day_48_344_ReverseString {
	
	public void reverseString(char[] s) {
        int l = 0, r = s.length-1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++; r--;
        }
    }
}
