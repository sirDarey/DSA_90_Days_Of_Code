/***
 * 
 * @author Sir Darey
 * 
 * Day 10: Leetcode Problem 38 - Count and Say
 *
 */


public class Day_10_38_CountAndSay {
	
	public String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
            s = count(s);
        }
        return s;
    }
    
    public String count(String s) {
        StringBuilder sb = new StringBuilder();
        char current = s.charAt(0);
        int count = 1, i = 1;
        
        while(i < s.length()){
            if(s.charAt(i) == current)
                count++;
            else {
                sb.append(count).append(current);
                current = s.charAt(i);
                count = 1;
            }
            i++;
        }
        sb.append(count).append(current);
        
        return sb.toString();
    }
}
