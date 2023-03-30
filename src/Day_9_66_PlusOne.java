/***
 * 
 * @author Sir Darey
 * 
 * Day 8: Leetcode Problem 66 - Plus One
 *
 */


public class Day_9_66_PlusOne {
	
	public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i=digits.length-1; i>=0; i--) {
            int temp = digits[i] + carry;
            digits[i] = temp%10;
            carry = temp/10;
        }

        if (carry > 0) {
            int [] result = new int [digits.length+1];
            for (int i=digits.length; i>0; i--) {
                result[i] = digits[i-1];
            }
            result[0] = carry;
            return result;
        }
        return digits;
    }
}
