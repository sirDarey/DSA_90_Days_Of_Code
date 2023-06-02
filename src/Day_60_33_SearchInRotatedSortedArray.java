/***
 * 
 * @author Sir Darey
 * 
 * Day 60: LeetCode Problem 33 - Search in Rotated Sorted Array
 * 
 * 
 */

public class Day_60_33_SearchInRotatedSortedArray {
	
	public int search(int[] nums, int target) {
	    
        int n = nums.length,  
                left = 0, right = n-1;
        
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[right ])
                left = mid+1;
            else {
                right = mid;
            }
        }
            
        int pivot = right;
        left = 0; right = n-1;
        
        while (left <= right) {
            int mid = left + (right - left)/2;
            int realMid = (pivot + mid)%n;
            
            if (nums[realMid] == target)
                return realMid;
            if (nums[realMid] >  target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
