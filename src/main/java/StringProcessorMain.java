
public class StringProcessorMain {

    public static void main(String[] args) {

        System.out.println("First Test\n----------");
        String[] firstSet = {"a", "b"};
        int firstLength = 3;
        StringProcessor.printAllStrings(firstSet, firstLength);

        System.out.println("\nSecond Test\n----------");
        String[] secondSet = {"c", "o", "d", "e"};
        int secondLength = 2;
        StringProcessor.printAllStrings(secondSet,
                secondLength);

        System.out.println("\nThird Test\n----------");
        String[] thirdSet = {"c", "o", "d", "e"};
        int thirdLength = 5;
        StringProcessor.printAllStrings(thirdSet,
                thirdLength);

        System.out.println("\nFourth Test\n----------");
        String[] fourthSet = {"alpha", "beta", "gamma", "delta"};
        int fourthLength = 3;
        StringProcessor.printAllStrings(fourthSet,
                fourthLength);
    }

}
