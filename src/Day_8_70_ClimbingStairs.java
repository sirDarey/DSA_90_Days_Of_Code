/***
 * 
 * @author Sir Darey
 * 
 * Day 8: Leetcode Problem 70 - Climbing Stairs
 *
 */


public class Day_8_70_ClimbingStairs {
	
	public int climbStairs(int n) {
        int a = 1, b = 1, c;
        
        for (int i=0; i<n-1;i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
