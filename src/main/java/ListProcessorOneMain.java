
public class ListProcessorOneMain {

    public static void main(String[] args) {
        int[] numList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//        System.out.println("\nArray before  invoking recursiveReverse method:");
//        ListProcessorOne.printArray(numList);
//        
//        ListProcessorOne.recursiveReverse(numList, 0, numList.length-1);
//        
//        System.out.println("\nArray after  invoking recursiveReverse method:");
//        ListProcessorOne.printArray(numList);    
        
        
        System.out.println("\nArray before  invoking loopReverse method:");
        ListProcessorOne.printArray(numList);
        
        ListProcessorOne.loopReverse(numList);
        
        System.out.println("\nArray after  invoking loopReverse method:");
        ListProcessorOne.printArray(numList);
        
        
    }

}
