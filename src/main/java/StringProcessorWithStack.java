
import java.util.Stack;

public class StringProcessorWithStack {

    private static class Entry {

        private String[] letters;
        private String prefix;
        private int numLetters;
        private int length;
        private int index;

        public Entry(String[] letters, String prefix, int numLetters, int length, int index) {
            this.letters = letters;
            this.prefix = prefix;
            this.numLetters = numLetters;
            this.length = length;
            this.index = 0;
        }

        public String[] getLetters() {
            return letters;
        }

        public void setLetters(String[] letters) {
            this.letters = letters;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public int getNumLetters() {
            return numLetters;
        }

        public void setNumLetters(int numLetters) {
            this.numLetters = numLetters;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

    }

    static int entryNumber = 0;

    public static void printAllStringsWithStack(String[] letters, int length) {

        int numLetters = letters.length;
        Entry entry = new Entry(letters, "", numLetters, length, 0);

        Stack stack = new Stack<>();
        stack.push(entry);
        //printAllStringsRecursive(letters, "", numLetters, length);

        while (!stack.empty()) {

            if (entry.getLength() == 0) {
                entryNumber++;
                System.out.println(entryNumber + " " + entry.getPrefix());
            } else {
                for (int index = entry.getIndex(); index < entry.getNumLetters(); index++) {
                    String newPrefix = entry.getPrefix() + letters[index];
                    entry = new Entry(letters, "", numLetters, length - 1, index);
                    stack.push(entry);

                    //printAllStringsRecursive(letters, newPrefix, numLetters,
                    //      length - 1);
                }
            }
            entry = (Entry) stack.pop();
        }

    }
}
