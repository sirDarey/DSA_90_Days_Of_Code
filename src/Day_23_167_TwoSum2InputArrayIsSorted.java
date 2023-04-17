
/***
 * 
 * @author Sir Darey
 * 
 * Day 23: Leetcode Problem 167 - Two Sum II - Input Array Is Sorted
 */

public class Day_23_167_TwoSum2InputArrayIsSorted {
	
	public int[] twoSum(int[] numbers, int target) {
        
        int i = 0, j = numbers.length-1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target)
                return new int[] {i+1 ,j+1};
            else {
                if (numbers[i] + numbers[j] > target )
                    j--;
                else
                    i++;
            }
        }
        return null;
    }
}
