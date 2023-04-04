import java.util.Stack;

/***
 * 
 * @author Sir Darey
 * 
 * Day 14: Leetcode Problem 225 - Implement Stack using Queues
 *
 */


public class Day_14_225_ImplementStackUsingQueues {
	
	Stack <Integer> stack = new Stack<>();
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
