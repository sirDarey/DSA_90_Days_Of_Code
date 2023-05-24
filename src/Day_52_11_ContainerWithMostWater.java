/***
 * 
 * @author Sir Darey
 * 
 * Day 52: LeetCode Problem 11 - Container With Most Water
 * 
 */

public class Day_52_11_ContainerWithMostWater {
	
	public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length-1;
        
        while (i < j) {
            int length = j - i, breadth = Math.min(height[i], height[j]),
                    area = length * breadth;

            max = Math.max(area, max);
            
            if (height[i] < height[j])
                i++;
            else if (height[i] > height[j])
                j--;
            else {
                i++; j--;
            }
        }
        
        return max;
    }
}
