/***
 * 
 * @author Sir Darey
 * 
 * Day 59: LeetCode Problem 31 - Next Permutation
 * 
 * 
 */

public class Day_59_31_NextPermutation {
	
	public void nextPermutation(int[] nums) {
        int n = nums.length;

        int p1 = -1, p2 = -1;
        for (int i=n-2; i>=0; i--)
            if (nums[i] < nums[i+1]) {
                p1 = i;
                break;
            }
            
        //Check if descending all through
        if (p1 == -1) {
            sort(nums, 0, n-1);
            return;
        }

        //Check if there's any element between the value before the peak  and the peak itself
        for (int i=n-1; i>=0; i--) {
            if (nums[i] > nums[p1]){
                p2 = i;
                break;
            }
        }

        //swap and then, sort the rest elements
        swap(nums, p1, p2);
        sort(nums, p1+1, n-1);
    }

    void swap (int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void sort (int [] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++; j--;
        }
    }  
}
