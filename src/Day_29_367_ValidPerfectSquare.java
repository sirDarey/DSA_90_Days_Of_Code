/***
 * 
 * @author Sir Darey
 * 
 * Day 29: Leetcode Problem 367 - Valid Perfect Square
 */

public class Day_29_367_ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        long l = 0, r = (num+1)/2, mid;
        while(l <= r) {
            mid = l + (r - l)/2;
            long square = mid*mid;
            if (square == num)
                return true;
            else if (square > num)
                r = mid-1;
            else
                l = mid+1;
        }
        return false;
    }
}
