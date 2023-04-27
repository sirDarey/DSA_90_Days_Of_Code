import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 32: Leetcode Problem 257 - Binary Tree Paths
 */

public class Day_32_257_BinaryTreePaths {
	
	class TreeNode {
		int val;
		TreeNode left;
	    TreeNode right;
	}
	
	List <String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        recur (root, String.valueOf(root.val));
        return result;
    }

    void recur(TreeNode node, String current) {
        if (node.left == null && node.right == null) {
            result.add(current);
            return;
        }

        if (node.left != null) recur(node.left, current+"->"+node.left.val);
        if (node.right != null) recur(node.right, current+"->"+node.right.val);                    
    }
}
