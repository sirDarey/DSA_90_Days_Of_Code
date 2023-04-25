/***
 * 
 * @author Sir Darey
 * 
 * Day 30: Leetcode Problem 205 - Isomorphic Strings
 */

public class Day_30_205_IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        int m = s.length(), n = t.length();
        if (m != n)
            return false;
        int [] arr1 = new int[256];
        int [] arr2 = new int[256];

        for (int i=0; i<m; i++) {
            if (arr1[s.charAt(i)] == arr2[t.charAt(i)]) {
                arr1[s.charAt(i)] = i+1;
                arr2[t.charAt(i)] = i+1;
            } else
                return false;
        }
        return true;
    }
}
