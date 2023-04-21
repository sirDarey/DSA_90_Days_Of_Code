/***
 * 
 * @author Sir Darey
 * 
 * Day 28: Leetcode Problem 387 - First Unique Character in a String
 */

public class Day_28_387_FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
        int [] arr = new int [26];
        for (char c : s.toCharArray())
            arr[c-'a']++;
        for (int i=0; i<s.length(); i++)
            if (arr[s.charAt(i)-'a'] == 1)
                return i;
        return -1;
    }
}
