/**  
* 
*  @Sir Darey
* 
* Day 75: Problem 91 - Decode Ways
* 
*/

public class Day_76_78_Subsets {
	
	public int numDecodings(String s) {
        int prev1 = (s.charAt(0) == '0')? 0 : 1;
        int prev2 = 1;
        int current = prev1;

        for (int i=2; i<=s.length(); i++) {
            current = 0;

            if (s.charAt(i-1) != '0')
                    current += prev1;
            if (s.charAt(i-2) == '1' || 
                (s.charAt(i-2) == '2' && s.charAt(i-1) < '7'))
                
                current += prev2;

            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
