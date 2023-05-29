import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 57: LeetCode Problem 15 - 3Sum
 * 
 * 
 */

public class Day_57_15_3Sum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);        
        List<List<Integer>> result = new ArrayList<>(); 
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int j = i+1, k = nums.length-1, sum = 0 - nums[i];
                while (j < k) {
                    if (nums[j] + nums[k] == sum) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j+1]) j++;
                        while (j < k && nums[k] == nums[k-1]) k--;
                        j++; k--;
                    } else if (nums[j] + nums[k] < sum) j++;
                    else k--;
               }
            }
        }
        return result;
    }  
}
