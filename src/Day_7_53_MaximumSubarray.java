/***
 * 
 * @author Sir Darey
 * 
 * Day 7: Leetcode Problem 53 - Maximum Subarray
 *
 */


public class Day_7_53_MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
