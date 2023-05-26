/***
 * 
 * @author Sir Darey
 * 
 * Day 55: LeetCode Problem 14 - Longest Common Prefix
 * 
 * 
 */

public class Day_55_14_LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String prefixSoFar = strs[0];

        for (int i=0; i<n; i++){
            String current = strs[i];
            int j = 0;
            while(j < Math.min(current.length(), prefixSoFar.length())
                 && current.charAt(j) == prefixSoFar.charAt(j)) {

                j++;
            }
                
            
            prefixSoFar = prefixSoFar.substring(0, j);
        }
        return prefixSoFar;
    }
}
