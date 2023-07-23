import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 64: LeetCode Problem 49 - GroupAnagrams
 * 
 * 
 */

public class Day_64_49_GroupAnagrams {
	
	List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    int n, k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n; this.k = k;
        backtrack(1);

        return result;
    }

    void backtrack(int i) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int j=i; j<=n; j++) {
            if (temp.contains(j))
                continue;

            temp.add(j);
            backtrack(j+1);
            temp.remove(temp.size()-1);
        }
    }
}
