import java.util.Stack;

/***
 * 
 * @author Sir Darey
 * 
 * Day 15: Leetcode Problem 226 - Invert Binary Tree
 *
 */

public class Day_15_226_InvertBinaryTree {
	
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
	
	public TreeNode invertTree(TreeNode root) {
       if (root == null) 
           return null;
        
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()){
        	TreeNode tempRoot = stack.pop(),
            tempRight = tempRoot.left,
            tempLeft = tempRoot.right; 
            tempRoot.left = tempLeft;
            tempRoot.right = tempRight;
            
            if (tempLeft!=null) stack.push(tempLeft);
            if (tempRight!=null) stack.push(tempRight);
        }
        return root;
    }
}
