
/***
 * 
 * @author Sir Darey
 * 
 * Day 24: Leetcode Problem 206 - Reverse Linked List
 */

public class Day_24_206_ReverseLinkedList {
	
	class ListNode {
       int val;
       ListNode next;
    }
	
	public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        
        ListNode current = head,
                previous = null, next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
}
