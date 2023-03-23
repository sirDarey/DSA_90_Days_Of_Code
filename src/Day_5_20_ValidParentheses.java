import java.util.Stack;

/***
 * 
 * @author Sir Darey
 * 
 * Day 5: LeetCode Problem 20 - Valid Parentheses
 *
 */

public class Day_5_20_ValidParentheses {
	
	public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (!stack.isEmpty()) {
                char open = stack.peek();
                if ((open == '(' && c == ')')
                		|| (open == '[' && c == ']')
                		|| (open == '{' && c == '}'))
                    
                    stack.pop();
                
                else
                    return false;
            } else
                return false;
        }
        return stack.isEmpty();
    }
}
