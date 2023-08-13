import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* Day 73: Problem 54 - Spiral Matrix
* 
*/

public class Day_73_54_SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int u = 0, d = matrix.length-1, l = 0, r = matrix[0].length-1;
        int status = 1; //1->right, 2->down, 3->left, 4->up
        List<Integer> result = new ArrayList<>();
        int count = 0, size = (d+1) * (r+1);
        
        while (count < size) {
            if (status == 1) {
                for(int i=l; i<=r; i++){
                    result.add(matrix[u][i]);
                    count++;
                }
                status = 2; u++;

            } else if (status == 2) {
                for(int i=u; i<=d; i++){
                    result.add(matrix[i][r]);
                    count++;
                }
                status = 3; r--;

            } else if (status == 3) {
                for(int i=r; i>=l; i--){
                    result.add(matrix[d][i]);
                    count++;
                }
                status = 4; d--;
            } else  {
                for(int i=d; i>=u; i--){
                    result.add(matrix[i][l]);
                    count++;
                }
                status = 1; l++;
            }
        }
        return result;
    }
}
