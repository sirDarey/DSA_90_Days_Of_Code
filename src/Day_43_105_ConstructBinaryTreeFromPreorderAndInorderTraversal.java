import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Sir Darey
 * 
 * Day 43: LeetCode Problem 105 - Construct Binary Tree from Preorder and Inorder Traversal
 */

public class Day_43_105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
	
	class TreeNode {
		TreeNode left, right;
		int val;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	Map<Integer, Integer> map = new HashMap<>();
    int [] preorder;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        
        return recur(0, 0, inorder.length-1);
    }
    
    private TreeNode recur(int pre_0_Index, int inLeft, int inRight) {
        int newRootValue = preorder[pre_0_Index], 
                inMid = map.get(newRootValue);
        
        TreeNode newRoot = new TreeNode(newRootValue);            
        if (inMid > inLeft)
            newRoot.left = recur(pre_0_Index+1, inLeft, inMid-1);
        if (inMid < inRight)
            newRoot.right = recur(pre_0_Index +inMid -inLeft +1, inMid+1, inRight);
        
        return newRoot;
    }
}
