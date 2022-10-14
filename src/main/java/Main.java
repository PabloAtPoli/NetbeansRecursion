
public class Main {

    public static void main(String[] args) {
        int[] numList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//        ListProcessor.loopReverse(numList);
        ListProcessor.recursiveReverse(numList, 0, numList.length-1);
        
        ListProcessor.printArray(numList);
    }

}
