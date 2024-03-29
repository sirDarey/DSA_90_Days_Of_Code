import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 65: LeetCode Problem 300 - Longest Increasing Subsequence
 * 
 * 
 */

public class Day_65_300_LongestIncreasingSubsequence {
	
	public int lengthOfLIS(int[] nums) {
        int maxSoFar = 1, n = nums.length; 
        int [] dp = new int [n];
        Arrays.fill(dp, 1);
        
        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (nums[i] > nums[j] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j]+1;
                    maxSoFar = Math.max(maxSoFar, dp[i]); 
                }
            }
        }
        
        return maxSoFar;
    }
}
