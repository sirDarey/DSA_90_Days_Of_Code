
/***
 * 
 * @author Sir Darey
 * 
 * Day 37: LeetCode Problem 268 -  Missing Number
 */

public class Day_37_268_MissingNumber {
	
	public int missingNumber(int[] nums) {
        int n = nums.length, x = 0, j = 0;
        for (int i=0; i<n; i++){
            x = x^nums[i];
            x = x^j;
            j++;
        }
        x = x^j;
        return x;
    }
}
