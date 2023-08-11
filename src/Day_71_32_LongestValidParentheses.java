import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 71: 32 - Longest Valid Parentheses
 * 
 * 
 */

public class Day_71_32_LongestValidParentheses {
	
	public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2 == 1) 
            return false;

        int[][] memo = new int[nums.length + 1][(sum/2) + 1];
        for (int[] row: memo) 
            Arrays.fill(row, -1);

        return canPartition(nums.length, sum/2, nums, memo);
    }

    private boolean canPartition(int index, int target, int[] nums, int[][] memo) {
        if (target == 0) 
            return true;
        if(index == 0 || target < 0) 
            return false;
        if(memo[index][target] != -1) 
            return memo[index][target] == 1;

        memo[index][target] = 
            canPartition(index-1, target - nums[index-1], nums, memo) || 
            canPartition(index-1, target, nums, memo) ? 1 : 0;

        return memo[index][target] == 1;
    }
}
