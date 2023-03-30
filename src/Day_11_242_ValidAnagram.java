/***
 * 
 * @author Sir Darey
 * 
 * Day 11: Leetcode Problem 242 - Valid Anagram
 *
 */


public class Day_11_242_ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int [] map = new int [26];
        for (char c : s.toCharArray())
            map[c-'a']++;
        for (char c : t.toCharArray())
            map[c-'a']--;
        for (int i : map)
            if(i > 0)
                return false;
        
        return true;        
    }
}
