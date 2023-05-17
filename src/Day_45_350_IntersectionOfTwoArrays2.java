import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 45: LeetCode Problem 350 - Intersection of Two Arrays II

 */

public class Day_45_350_IntersectionOfTwoArrays2 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < m && j < n) {
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
