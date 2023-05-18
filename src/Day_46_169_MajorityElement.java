/***
 * 
 * @author Sir Darey
 * 
 * Day 46: LeetCode Problem 169 - Majority Element


 */

public class Day_46_169_MajorityElement {
	
	public int majorityElement(int[] nums) {
        int current = nums[0];
        int count = 0;
        
        for(int num : nums){
            if(count == 0)
                current = num;
            count += (current == num)? 1 : -1;
        }
        return current;
    }
}
