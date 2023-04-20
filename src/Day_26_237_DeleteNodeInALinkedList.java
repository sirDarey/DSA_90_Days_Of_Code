/***
 * 
 * @author Sir Darey
 * 
 * Day 26: Leetcode Problem 237 - Delete Node in a Linked List
 */

public class Day_26_237_DeleteNodeInALinkedList {
	class ListNode {
		int val;
		ListNode next;
	}
	
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
