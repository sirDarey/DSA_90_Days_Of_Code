/**  
* 
*  @Sir Darey
* 
* Day 79: Problem 50 - Pow(x, n)
* 
*/

public class Day_79_50_PowX_N {
	
	public double myPow(double x, int n) {
        if (x == 0)
            return 0d;
        
        if (n >= 0)
            return calc(x, n);
        return 1/calc(x, Math.abs(n));
    }

    double calc(double x, int n) {
        if (n == 0)
            return 1;
        
        double temp = calc(x, n/2);
        temp *= temp;
        if ((n&1) == 1)
            return temp * x;
            
        return temp;
    }
}
