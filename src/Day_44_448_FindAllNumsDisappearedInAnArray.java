import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * 
 * @author Sir Darey
 * 
 * Day 44: LeetCode Problem 448 - Find All Numbers Disappeared in an Array
 */

public class Day_44_448_FindAllNumsDisappearedInAnArray {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = 0;
        Set <Integer> set = new HashSet<>();
        for (int num : nums) {
            max = Math.max(max, num);
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i=1; i<=nums.length; i++) {
            if (!set.contains(i))
                result.add(i);
        }
        return result;
    }
}
