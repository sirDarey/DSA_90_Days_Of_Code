
/***
 * 
 * @author Sir Darey
 * 
 * Day 18: Leetcode Problem 104 - Maximum Depth of Binary Tree
 *
 */

public class Day_18_104_MaximumDepthOfBinaryTree {
	
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
	
	int maxSoFar = 1;
    
    public int maxDepth(TreeNode root) {
      if (root == null) 
          return 0;
      
      return recur(root, 1);
    }
     
    int recur (TreeNode tempRoot, int max) {
        TreeNode tempRight = tempRoot.right,
                 tempLeft = tempRoot.left;
        if (tempRight != null)
            maxSoFar = Math.max(max, recur (tempRight, max+1));
        if (tempLeft != null)
            maxSoFar = Math.max(max, recur (tempLeft, max+1));
        return Math.max(max, maxSoFar);
    }
}
