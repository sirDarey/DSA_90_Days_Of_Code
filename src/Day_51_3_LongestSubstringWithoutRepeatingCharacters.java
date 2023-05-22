import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Sir Darey
 * 
 * Day 51: LeetCode Problem 3 - Longest Substring Without Repeating Characters
 * 
 */

public class Day_51_3_LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map <Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            if (map.containsKey(c))
                start = Math.max(start, map.get(c)+1);
            
            map.put(c, end);
            max = Math.max(max, (end - start +1));            
        }
        return max;
    }
}
