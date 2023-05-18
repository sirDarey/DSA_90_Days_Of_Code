import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 50: LeetCode Problem 414 - Third Maximum Number
 * 
 */

public class Day_50_414_ThirdMaxNum {
	
	public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length-2, max = nums[i+1], count = 1, result = max;

        while (i >= 0 && count < 3) {
            if (nums[i] != nums[i+1]) {
                count++;
                result = nums[i];
            }
            i--;
        }
        return (count == 3)? result : max;
    }
}
