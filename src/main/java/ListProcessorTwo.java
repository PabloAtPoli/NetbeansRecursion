
public class ListProcessorTwo {

    public static int sumNumbers(int[] numbers, int numbersLength) {
        if (numbersLength <= 0) {
            return 0;
        }

        return (sumNumbers(numbers, numbersLength - 1) + numbers[numbersLength - 1]);
    }
}
