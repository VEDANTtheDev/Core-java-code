public class checkStringPalindromeRecursion {

    // Recursive function to check if the string is a palindrome using a single pointer
    public static boolean isPalindrome(String str, int start) {
        int n = str.length();

        // Base case: If the start pointer crosses the middle, the string is a palindrome
        if (start >= n / 2) {
            return true;
        }

        // Check if characters at start and corresponding end index are equal
        if (str.charAt(start) != str.charAt(n - start - 1)) {
            return false;
        }

        // Recursive call to check the next characters
        return isPalindrome(str, start + 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}