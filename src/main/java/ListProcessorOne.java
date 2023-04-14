/*
 * Processes data stored in lists
 */
public final class ListProcessorOne {
   //Iteratively reverses an array
    public static void loopReverse(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
   //Recursively reverses an array
    public static void recursiveReverse(int[] numbers, int start, int end) {
        if (start >= end) {
            return;
           // System.out.println("Done");
        } else {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            recursiveReverse(numbers, start + 1, end - 1);
        }
    }

    /*
   * Prints the contents of an array
     */
    public static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }

}
