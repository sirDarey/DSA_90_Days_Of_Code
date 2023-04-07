
/***
 * 
 * @author Sir Darey
 * 
 * Day 16: Leetcode Problem 100 - Same Tree
 *
 */

public class Day_16_100_SameTree {
	
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null) {
            if (p.val == q.val) 
                if (isSameTree(p.left, q.left))
                    return isSameTree(p.right, q.right);
            return false;
        } 
        return false;
    }
}
