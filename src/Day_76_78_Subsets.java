import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* Day 76: Problem 78 - Subsets 
* 
*/

public class Day_76_78_Subsets {
	
	 	List<List<Integer>> result = new ArrayList<>();
	    List<Integer> temp = new ArrayList<>();
	    int n;
	    int [] nums;
	            
	    public List<List<Integer>> subsets(int[] nums) {
	        n = nums.length;
	        this.nums = nums;
	        recur (0);
	        return result;
	    }
	    
	    void recur (int i) {
	        if (i == n) {
	            result.add(new ArrayList<>(temp));
	            return;
	        }
	        
	        temp.add(nums[i]);
	        recur (i + 1);
	        
	        temp.remove(temp.size()-1);
	        recur(i + 1);
	    }
}
