
import java.util.Stack;


public class StringProcessor {

    public static void printAllStrings(String[] letters, int length) {
        int numLetters = letters.length;
        printAllStringsRecursive(letters, "", numLetters, length);
        
    }

    private static void printAllStringsRecursive(String[] letters,
            String prefix, int numLetters, int length) {

        if (length == 0) {
            System.out.println(prefix);
            return;
        }

        for (int index = 0; index < numLetters; index++) {
            String newPrefix = prefix + letters[index];
            printAllStringsRecursive(letters, newPrefix, numLetters,
                    length - 1);
        }
    }
}
