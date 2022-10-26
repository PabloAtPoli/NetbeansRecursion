
public class ListProcessorOneMain {

    public static void main(String[] args) {
        int[] numList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//        ListProcessorOne.loopReverse(numList);
        ListProcessorOne.recursiveReverse(numList, 0, numList.length-1);
        
        ListProcessorOne.printArray(numList);
    }

}
