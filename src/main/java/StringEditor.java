
public class StringEditor {

    public static String loopVersion(String text) {
        String reversed = "";

        for (int index = text.length() - 1; index >= 0; index--) {
            reversed = reversed + text.substring(index, index + 1);
        }

        return reversed;
    }

    public static String recursiveVersion(String text) {
        if (text.length() == 0) {
            return "";
        }

        return recursiveVersion(text.substring(1)) + text.substring(0, 1);
    }
}
