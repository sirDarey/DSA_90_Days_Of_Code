
/***
 * 
 * @author Sir Darey
 * 
 * Day 34: LeetCode Problem 204 - Count Primes
 */

public class Day_34_204_CountPrimes {
	
	public int countPrimes(int n) {
        boolean arr [] = new boolean[n];
        int count = 0;
        for(long i=2;i<n;i++) {
            if(!arr[(int)i]) {
                count++;
                for(long j=i*i;j<n;j+=i)
                    arr[(int)j] = true;
            }            
        }
        return count;
    }
}
