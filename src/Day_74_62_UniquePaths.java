import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* Day 74: Problem 62 - Unique Paths 
* 
*/

public class Day_74_62_UniquePaths {
	
	 public int uniquePaths(int m, int n) {
	        int dp [][] = new int [m][n];
	        Arrays.fill(dp[0], 1);
	        for (int i=1; i<m; i++) {
	            dp[i][0] = 1;
	        }
	        for (int i=1; i<m; i++){
	            for (int j=1; j<n; j++) {
	                dp[i][j] = dp[i-1][j] + dp[i][j-1];
	            }
	        }
	        return dp[m-1][n-1];
	    }
}
