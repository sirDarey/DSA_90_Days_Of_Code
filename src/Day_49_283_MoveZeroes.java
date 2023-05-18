/***
 * 
 * @author Sir Darey
 * 
 * Day 49: LeetCode Problem 283 - Move Zeroes
 *
 */

public class Day_49_283_MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        int zeros = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) 
                zeros++;
            else if (zeros > 0){
                nums[i-zeros] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
