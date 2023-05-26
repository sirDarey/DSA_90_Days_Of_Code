import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 56: LeetCode Problem 17 - Letter Combinations of a Phone Number
 * 
 * 
 */

public class Day_56_17_LetterCombinationsOfAPhoneNum {
	
	List <String> result = new ArrayList<>();
    String digits;
    int n;
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        n = digits.length();
        
        
        if (!digits.isEmpty())
            recur (0, "");
        return result;
    }
    
    void recur (int i, String temp) {
        if (temp.length() == n) {
            result.add(temp);
            return;
        }
        
        for (char c : KEYS[digits.charAt(i)-'0'].toCharArray())
            recur(i+1, temp+c);
    }
}
