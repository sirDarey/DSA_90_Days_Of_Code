import java.util.HashSet;
import java.util.Set;

/***
 * 
 * @author Sir Darey
 * 
 * Day 12: Leetcode Problem 202. Happy Number
 *
 */


public class Day_12_202_HappyNumber {
	
	Set <Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        
        int sum = 0;
        while (n > 0) {
            sum += (n%10) * (n%10);
            n /= 10;
        }

        if (!set.add(sum))
            return false;

        return isHappy(sum);
    }
}
