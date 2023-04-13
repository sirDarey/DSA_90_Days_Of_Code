
/***
 * 
 * @author Sir Darey
 * 
 * Day 21: Leetcode Problem 141 - Linked List Cycle
 */

public class Day_21_141_LinkedListCycle {
	
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
	
	public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        
        ListNode slow = head, fast = head.next;
        
        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
