import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Sir Darey
 * 
 * Day 1: Leetcode Problem 1 - Two Sum
 *
 */



public class Day_1_1_TwoSum {
	public int[] twoSum(int[] nums, int target) {
        
	       int [] result = new int[2];
	        
	        Map <Integer, Integer> map = new HashMap<>();
	        map.put (nums[0], 0);
	        for (int i=1; i<nums.length; i++){
	            
	            if (map.containsKey(target - nums[i])) { 
	            result [0] = map.get (target-nums[i]);
	                result [1] = i;
	                
	                return result;
	            }
	            map.put (nums[i], i);
	            }
	        return null;
	}
}
