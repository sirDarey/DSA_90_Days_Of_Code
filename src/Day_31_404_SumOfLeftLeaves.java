/***
 * 
 * @author Sir Darey
 * 
 * Day 31: Leetcode Problem 404 - Sum Of Left Leaves
 */

public class Day_31_404_SumOfLeftLeaves {
	
	class TreeNode {
		int val;
		TreeNode left;
	    TreeNode right;
	}
	
	int result = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left != null)
            recur (root.left, 0);
        if (root.right != null)
            recur(root.right, 1);
        return result;
    }

    //0-left; 1-right
    void recur (TreeNode node, int status) {
        if(node.left == null && node.right == null){
            if (status == 0)
                result += node.val;
        } else {
            if (node.left != null)
                recur (node.left, 0);
            if (node.right != null)
                recur(node.right, 1);
        }
    }
}
