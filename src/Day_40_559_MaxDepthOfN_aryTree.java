import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * 
 * @author Sir Darey
 * 
 * Day 40: LeetCode Problem 559 - Maximum Depth of N-ary Tree
 */

public class Day_40_559_MaxDepthOfN_aryTree {
	
	class Node {
	    public int val;
	    public List<Node> children;
	}
	
	public int maxDepth(Node root) {
        if (root == null)
            return 0;

        Queue<Node> n = new LinkedList<>();
        Queue<Integer> i = new LinkedList<>();
        n.offer(root);
        i.offer(1);
        int maxDepth = 0;

        while (!n.isEmpty()) {
            Node currentNode = n.poll();
            int currentDepth = i.poll();
            maxDepth = Math.max(maxDepth, currentDepth);

            for (Node child : currentNode.children){
                n.offer(child);
                i.offer(currentDepth+1);
            }           
        }
        return maxDepth;
    }
}
