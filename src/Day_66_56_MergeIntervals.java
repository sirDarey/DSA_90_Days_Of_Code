import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/***
 * 
 * @author Sir Darey
 * 
 * Day 66: LeetCode Problem 56 - Merge Intervals
 * 
 * 
 */

public class Day_66_56_MergeIntervals {
	
	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0])
                    return a[1] - b[1]; 
                return a[0] - b[0];
            }
        });

        List <int []> list = new ArrayList<>();
        int i = 0, n = intervals.length-1, b = 0;

        while (i < n) {
            int a = intervals[i][0];
            b = intervals[i][1];

            while (i < n && b >= intervals[++i][0])
                b = Math.max(intervals[i][1], b);
            
            list.add(new int [] {a, b});
        }

        if (b != Math.max(intervals[n][1], b))
            list.add(new int [] {intervals[n][0], intervals[n][1]});

        return list.toArray(new int[list.size()][2]);
    }
}
