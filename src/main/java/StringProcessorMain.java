
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

    }

}
