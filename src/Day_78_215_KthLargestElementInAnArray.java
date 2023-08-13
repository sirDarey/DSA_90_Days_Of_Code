import java.util.PriorityQueue;

/**  
* 
*  @Sir Darey
* 
* Day 78: Problem 215 - Kth Largest Element in an Array
* 
*/

public class Day_78_215_KthLargestElementInAnArray {
	
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> q = new PriorityQueue<>(); ;
        for (int i : nums) {
            q.offer(i);
            if (q.size() > k)
                q.poll();
        }
        return q.peek();
    }
}
