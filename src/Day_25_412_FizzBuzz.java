import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 25: Leetcode Problem 412 - Fizz Buzz
 */

public class Day_25_412_FizzBuzz {
	
	public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }
}
