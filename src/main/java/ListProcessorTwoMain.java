
public class ListProcessorTwoMain {

    public static void main(String[] args) {

        System.out.println("First Test\n----------");
        int[] firstList = {10, 20, 30};
        int firstSum = ListProcessorTwo.sumNumbers(firstList, firstList.length);
        System.out.println("First List Sum: " + firstSum);

        System.out.println("\nSecond Test\n----------");
        int[] secondList = {21, 2, 4, 82, 81, 33, 67, 52, 22, 23};
        int secondSum = ListProcessorTwo.sumNumbers(secondList, secondList.length);
        System.out.println("Second List Sum: " + secondSum);
    }

}
