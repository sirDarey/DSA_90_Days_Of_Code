
/***
 * 
 * @author Sir Darey
 * 
 * Day 20: Leetcode Problem 160 - Intersection of Two Linked Lists
 *
 */

public class Day_20_160_IntersectionOfTwoLinkedLists {
	
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null) return null;
    
        ListNode a = headA;
        ListNode b = headB;
        
        while( a != b){
            a = (a == null)? headB : a.next;
            b = (b == null)? headA : b.next;    
        }
        
        return a;
    }
}
