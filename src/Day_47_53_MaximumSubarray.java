/***
 * 
 * @author Sir Darey
 * 
 * Day 47: LeetCode Problem 53 - Maximum Subarray
 *
 */

public class Day_47_53_MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
        int max = nums[0]; 

        for (int i=1; i<nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
