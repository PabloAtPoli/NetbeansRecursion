
import java.util.Stack;


public class StringProcessor {
    
    static int entryNumber=0;

    public static void printAllStrings(String[] letters, int length) {
        int numLetters = letters.length;
        printAllStringsRecursive(letters, "", numLetters, length);
        
    }

    private static void printAllStringsRecursive(String[] letters,
            String prefix, int numLetters, int length) {

        if (length == 0) {
            entryNumber++;
            System.out.println(entryNumber + " "+ prefix);
            return;
        }

        for (int index = 0; index < numLetters; index++) {
            String newPrefix = prefix + letters[index];
            printAllStringsRecursive(letters, newPrefix, numLetters,
                    length - 1 );
        }
    }
}
