package list.com;

import java.util.*;

public class RemoveDuplicatedItems {

    public static void main(String[] args) {
      
        //This program will remove items from list1 
        //if it contains duplicated items from list2
        
        String[] items1 = {"apple", "banana", "kiwi", "mango", "peper"};
        List<String> list1 = new ArrayList<String>();
        for(String x: items1)
            list1.add(x);
        
        String[] items2 = {"banana", "mango"};
        List<String> list2 = new ArrayList<String>();
        for(String y: items2)
            list2.add(y);
        
        //Printout to check list1:
        System.out.println("List1 before removing items: ");
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        
        //Method call:
        editList(list1, list2);
        System.out.println();
          
      //Printout list1 again after removing items:
        System.out.println("List1 after removing duplicated items from list2: ");
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }       
    }

    public static void editList(Collection<String> l1, Collection<String> l2) {
        
        Iterator<String> items = l1.iterator();
        
        while(items.hasNext()) {
            if(l2.contains(items.next())){
                items.remove();
            }
        }
    }
}
