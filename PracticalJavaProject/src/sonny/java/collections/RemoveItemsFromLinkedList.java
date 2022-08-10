package sonny.java.collections;

import java.util.*;

public class RemoveItemsFromLinkedList {

    public static void main(String[] args) {
        
        
        String[] arr1 = {"Brain","Steve","Austin","Jay"};
        List<String> list1 = new LinkedList<String>(Arrays.asList(arr1));
        
        String[] arr2 = {"Michael","Gloria", "Charles", "Khanh"};
        List<String> list2 = new LinkedList<String>(Arrays.asList(arr2));
        
        //System.out.printf("%s ", list1);
        
        list1.addAll(list2);
        list2 = null; //free memory list2
      
        outPut(list1);
        
        System.out.println();
        removeSomeItems(list1, 2, 5);
        System.out.println();   
        outPut(list1);
        System.out.println();
        reverseList(list1);
        

    }

    private static void outPut(List<String> list1) {
        
        for(String items: list1)
            System.out.printf("%s ", items);
        
    }
    
    private static void removeSomeItems(List<String> list1, int from, int to) {
        
        list1.subList(from, to).clear();
        
    }
    
    private static void reverseList(List<String> list1) {
        
        ListIterator<String> it = list1.listIterator(list1.size());
        
        while( it.hasPrevious()) {
            System.out.printf("%s ",it.previous());
        }
        
        System.out.println();
    }

}
