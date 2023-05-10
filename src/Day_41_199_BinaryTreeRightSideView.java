import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * 
 * @author Sir Darey
 * 
 * Day 41: LeetCode Problem 199 - Binary Tree Right Side View
 */

public class Day_41_199_BinaryTreeRightSideView {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> t = new LinkedList<>();
        t.offer(root);

        while (!t.isEmpty()) {
            int currentSize = t.size();
            for (int i=0; i<currentSize-1; i++){
                TreeNode node = t.poll();
                addToQueue (node.left, t);
                addToQueue (node.right, t);
            }
            TreeNode extremeRight = t.poll();
            result.add(extremeRight.val);
            addToQueue (extremeRight.left, t);
            addToQueue (extremeRight.right, t);
        }
        return result;
    }

    void addToQueue(TreeNode node, Queue<TreeNode> t) {
        if (node != null)
            t.offer(node);
    }
}
