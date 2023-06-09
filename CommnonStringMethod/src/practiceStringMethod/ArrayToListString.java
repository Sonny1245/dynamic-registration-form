package practiceStringMethod;

import java.util.*;

public class ArrayToListString {

    public static void main(String[] args) {
        
        String[] arr1 = {"apple", "banana", "mango", "kiwi"};
        List<String> list1 = new ArrayList<String>();
        for(String x: arr1) {
            list1.add(x);
        }
        
        String[] arr2 = {"banana", "mango"};
        List<String> list2 = new ArrayList<String>();
        for(String y: arr2) {
            list2.add(y);
        }
        
        //Print out list1:
        System.out.print("Original List1: ");
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));         
        }
        
        //Function calls:
        editList(list1,list2);
        
        System.out.println();
        
      //Print out list1 again, but remove list2 from list1:
        System.out.print("List1 after removing duplicated items from List2: ");
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));         
        }

    }
    
    public static void editList(Collection<String> l1, Collection<String> l2) {
        
        Iterator<String> item = l1.iterator();
        
        while(item.hasNext()) {
            if(l2.contains(item.next()))
                item.remove();
        }
    }

}
