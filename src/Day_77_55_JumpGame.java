/**  
* 
*  @Sir Darey
* 
* Day 77: Problem 55 - Jump Game 
* 
*/

public class Day_77_55_JumpGame {
	
	 public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for (int i=nums.length-2; i>=0; i--) {
            if (goal - i <= nums[i])
                goal = i;
        }
        return goal == 0;
	 }
}
