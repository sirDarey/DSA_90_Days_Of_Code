/***
 * 
 * @author Sir Darey
 * 
 * Day 62: LeetCode Problem 23. Merge k Sorted Lists
 * 
 * 
 */

public class Day_62_23_MergeKSortedLists {
	
	private class ListNode {
		ListNode next;
		int val;
		
		public ListNode (int val) {
			this.val = val;
		}
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
        return divide(lists, 0, lists.length-1);
    }

    ListNode divide(ListNode[] lists, int left, int right) {
        if (left > right)
            return null;
        if (left == right)
            return lists[left];
        
        int mid = (left + right)/2;
        ListNode L1 = divide(lists, left, mid);
        ListNode L2 = divide(lists, mid+1, right);

        return conquer(L1, L2);
    }

    ListNode conquer(ListNode L1, ListNode L2) {
        ListNode headDummy = new ListNode(1);
        ListNode tail = headDummy;

        while (L1 != null && L2 != null) {
            
            if (L1.val < L2.val) {
                tail.next = L1;
                L1 = L1.next;
            } else {
                tail.next = L2;
                L2 = L2.next;
            }
            tail = tail.next;
        }

        if (L1 == null)
            tail.next = L2;
        else
            tail.next = L1;

        return headDummy.next;
    }
}
