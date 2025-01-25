import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MajorityAlliance {

    public static void main(String[] args)  throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        int n = Integer.parseInt(br.readLine().trim());

        // Read the votes array
        String[] input = br.readLine().trim().split(" ");
        int[] votes = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            votes[i] = Integer.parseInt(input[i]);
            totalSum += votes[i];
        }

        // Sort the votes in descending order
        Arrays.sort(votes);

        List<Integer> result = new ArrayList<>();
        int currentSum = 0;

        for (int i = n - 1; i >= 0; i--) {
            currentSum += votes[i];
            result.add(votes[i]);
            if (currentSum > totalSum - currentSum) {
                break;
            }
        }

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}