/***
 * 
 * @author Sir Darey
 * 
 * Day 53: LeetCode Problem 5 - Longest Palindromic Substring
 * 
 */

public class Day_53_5_LongestPalindromicSubstring {
	
	String s, ans = ""; int n, length = 0;
    
    public String longestPalindrome(String s) {
        n = s.length();
        if (n == 1)
            return s;
        
        this.s = s;
        
        for (int i=0; i<n; i++) {
            //Odd length
            checkPalindrome(i, i);
            //Even Length
            checkPalindrome(i, i+1);
        }
         
        return ans;
    }
    
    void checkPalindrome(int left, int right) {
        while (left > -1 && right < n && s.charAt(left) == s.charAt(right)) {
            int diff = right - left +1;
            if (diff >length) {
                length = diff;
                ans = s.substring(left, right+1);
            }
            left--; right++;
        }
    }
}
