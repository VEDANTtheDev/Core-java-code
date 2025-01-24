import java.util.*;

public class FirstPalindrome {
    // Placeholder function for user logic
    private static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        // User should implement the logic here
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        // This function should return the first palindromic string in the array
        // If no such string exists, return an empty string ""
        return "";
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {  // Check if input starts with an integer
            System.out.println("");   // Print empty string instead of space
            return;
        }

        int n = scanner.nextInt();  // Read the number of strings
        scanner.nextLine();  // Consume the newline character

        if (n <= 0) {  // Edge case: No strings provided
            System.out.println("");  // Print empty string instead of space
            return;
        }

        String inputLine = scanner.nextLine().trim();
        String[] arr = inputLine.split("\\s+");  // Split input into words

        // Call user logic function and print the output
        String result = firstPalindrome(arr);
        System.out.println(result.isEmpty() ? "" : result);  // Ensure correct output format
    }

}
