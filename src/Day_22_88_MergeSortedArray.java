import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 22: Leetcode Problem 88 - Merge Sorted Array
 */

public class Day_22_88_MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        
        for (int i=m; i<m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
