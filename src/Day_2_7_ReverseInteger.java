/***
 * 
 * @author Sir Darey
 * 
 * Day 2: Leetcode Problem 7 - Reverse Integer
 *
 */



public class Day_2_7_ReverseInteger {
	public int reverse(int x) {
        long reversed = 0;

        while(x != 0) {     
            reversed = (reversed*10l) + x%10;     
            x /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
            return 0;

        return (int)reversed;
    }
}
