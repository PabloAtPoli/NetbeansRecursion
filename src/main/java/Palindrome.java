
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Using Palindrome Iterative");
        System.out.println("Is the string \"civic\" palindrome? = " + palindromeIterative("civic"));
        System.out.println("Is the string \"code\" palindrome? = " + palindromeIterative("code"));
        System.out.println("Is the string \"Civic\" palindrome? = " + palindromeIterative("Civic"));
        System.out.println("Is the string \"anita lava la tina\" palindrome? = " + palindromeIterative("anita lava la tina"));

        System.out.println("\nUsing Palindrome Recursive");
        System.out.println("Is the string \"civic\" palindrome? = " + palindromeRecursive("civic"));
        System.out.println("Is the string \"code\" palindrome? = " + palindromeRecursive("code"));
        System.out.println("Is the string \"Civic\" palindrome? = " + palindromeRecursive("Civic"));
        System.out.println("Is the string \"anita lava la tina\" palindrome? = " + palindromeRecursive("anita lava la tina"));
    }

    public static boolean palindromeIterative(String s) {
        // It removes all white spaces from string s
        s = s.replaceAll("\\s+", "");

        while (s.length() > 1) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                s = s.substring(1, s.length() - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeRecursive(String s) {
        // It removes all white spaces from string s
        s = s.replaceAll("\\s+", "");

        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                palindromeRecursive(s.substring(1, s.length()-1));
            } else {
                return false;
            }
        }
        return true;
    }
}
