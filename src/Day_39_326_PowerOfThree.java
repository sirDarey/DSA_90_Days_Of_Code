/***
 * 
 * @author Sir Darey
 * 
 * Day 39: LeetCode Problem 326 - Power of Three
 */

public class Day_39_326_PowerOfThree {
	
	public boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        return (n==0 || n%3 != 0)? false : isPowerOfThree(n/3);
    }
}
