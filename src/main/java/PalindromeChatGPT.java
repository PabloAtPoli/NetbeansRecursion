
public class PalindromeChatGPT {

    public static boolean isPalindromeIterative(String str) {
        if (str == null) {
            return false;
        }
        str = str.replaceAll("\\s", ""); // remove all white spaces
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        if (str == null) {
            return false;
        }
        str = str.replaceAll("\\s", ""); // remove all white spaces
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true; // base case: the substring is a palindrome
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false; // base case: the substring is not a palindrome
        }
        return isPalindromeHelper(str, left + 1, right - 1); // recursive case: check the next pair of characters
    }

    public static void main(String[] args) {
        String palindrome = "racecar";
        String notPalindrome = "hello";

        System.out.println("Palindrome Chap GPT Iterative");
        System.out.println("Is the string \"racecar\" palindrome?="+isPalindromeIterative(palindrome)); // true
        System.out.println("Is the string \"hello\" palindrome?="+isPalindromeIterative(notPalindrome)); // false

        System.out.println("\nPalindrome Chap GPT Recursive");
        System.out.println("Is the string \"racecar\" palindrome?="+isPalindromeIterative(palindrome)); // true
        System.out.println("Is the string \"hello\" palindrome?="+isPalindromeIterative(notPalindrome)); // false
    }

}
