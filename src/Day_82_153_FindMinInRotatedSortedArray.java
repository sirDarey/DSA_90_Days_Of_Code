/**  
* 
*  @Sir Darey
* 
* Day 82: 153 - Find Minimum in Rotated Sorted Array
* 
*/

public class Day_82_153_FindMinInRotatedSortedArray {
	
	public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[right])
                left = mid+1;
            else {
                right = mid;
            }
        }
       return nums[right];
        
    }
}
