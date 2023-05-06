import java.util.Arrays;

/***
 * 
 * @author Sir Darey
 * 
 * Day 38: LeetCode Problem 1029 - Two City Scheduling
 */

public class Day_38_1029_TwoCityScheduling {
	
	public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int [] refund = new int[n];
        int minCost = 0;

        for (int i=0; i<n; i++) {
            minCost += costs[i][0];
            refund[i] = costs[i][1] - costs[i][0];
        }

        Arrays.sort(refund);
        for (int i=0; i<n/2; i++){
            minCost += refund[i];
        }
        return minCost;
    }
}
