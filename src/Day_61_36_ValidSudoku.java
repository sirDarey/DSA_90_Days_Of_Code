import java.util.HashSet;
import java.util.Set;

/***
 * 
 * @author Sir Darey
 * 
 * Day 61: LeetCode Problem 36 - Valid Sudoku
 * 
 * 
 */

public class Day_61_36_ValidSudoku {
	
	public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
         Set<Character> set = new HashSet<>();
         
	         for (int j=0; j<9; j++) {
	             if (Character.isDigit(board[i][j])) {
	                 if (set.contains(board[i][j]))
	                 return false;
	                 
	                 set.add(board[i][j]);
	             }                    
	         }
        }
     
	     for (int i=0; i<9; i++) {
	         Set<Character> set = new HashSet<>();
	         
	         for (int j=0; j<9; j++) {
	             if (Character.isDigit(board[j][i])) {
	                 if (set.contains(board[j][i]))
	                 return false;
	                 
	                 set.add(board[j][i]);
	             }
	         }
	     }
      
	     for (int i=0; i<3; i++) {
	         for (int j=0; j<3; j++) {
	         
	             Set<Character> set = new HashSet<>();
	
	             for (int k=3*i; k<(3*i+3); k++) {
	                 for (int l=3*j; l<(3*j+3); l++) {
	                     if (Character.isDigit(board[k][l])) {
	                         if (set.contains(board[k][l]))
	                         return false;
	
	                         set.add(board[k][l]);
	                     }
	                 }
	             }
	         }
	     }
	     
	     return true;
	}
}
