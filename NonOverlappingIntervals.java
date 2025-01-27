import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        
        // Read number of rows (n) and columns (m)
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] intervals = new int[n][m];

        // Read the intervals
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start
            intervals[i][1] = sc.nextInt(); // end
        }

        // Find the minimum number of intervals to remove
        int result = eraseOverlapIntervals(intervals);

        // Print the result
        System.out.println(result);

        sc.close();
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                count++;  // Overlapping interval, remove it
            } else {
                prevEnd = intervals[i][1];  // Update end of non-overlapping interval
            }
        }

        return count;
    }
}