
/***
 * 
 * @author Sir Darey
 * 
 * Day 35: LeetCode Problem 557 - Reverse Words in a String III
 */

public class Day_35_557_ReverseWordsInAString3 {
	
	char[] arr;
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0, n = arr.length;
        this.arr = arr;
        
        for(int j=0; j<n; j++) {
            if(arr[j] == ' ') {
                reverse(i, j - 1);
                i = j + 1;
            }
        }
        reverse(i, n-1);
        return new String(arr);
}

    public void reverse(int l, int r) {
        while(l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
}
