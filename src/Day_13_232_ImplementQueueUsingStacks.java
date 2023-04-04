import java.util.LinkedList;
import java.util.Queue;

/***
 * 
 * @author Sir Darey
 * 
 * Day 13: Leetcode Problem 232 - Implement Queue using Stacks
 *
 */


public class Day_13_232_ImplementQueueUsingStacks {
	
	Queue <Integer> queue = new LinkedList<>();
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        return(queue.poll());
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
