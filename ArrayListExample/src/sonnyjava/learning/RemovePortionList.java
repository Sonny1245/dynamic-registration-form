package sonnyjava.learning;

import java.util.*;

public class RemovePortionList {

    public static void main(String[] args) {
        
        String[] arr1 = {"apple", "kiwi","Straberry", "mango"};
        //Convert Array to List1 without using enhanced loop
        List<String> list1 = new LinkedList<String>(Arrays.asList(arr1));
        
        String[] arr2 = {"watermelon", "banana", "apple","jackfruit"};
        List<String> list2 = new LinkedList<String>(Arrays.asList(arr2));
        
        list1.addAll(list2);//Combine list2 to list1
        list2 = null; //free memory list2 since we are not using it
        
        printList(list1);
        removeSomeItems(list1, 2, 5);
        printList(list1);
        reverseList(list1);

    }

    private static void printList(List<String> list1) {
        
        for(String item: list1)
            System.out.printf("%s ", item);
        
        System.out.println();
        
    }
    
    private static void removeSomeItems(List<String> list1, int from, int to) {
        
        list1.subList(from, to).clear();
        
    }
    
    private static void reverseList(List<String> list1) {
        
        ListIterator<String> it = list1.listIterator(list1.size());
        
        while(it.hasPrevious()) {
            System.out.print(it.previous()+ " ");
        }
        
        System.out.println();
        
    }


}
