package sonny.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RemoveDuplicatedItemsFromTheList {

    public static void main(String[] args) {
        
        String[] items1 = {"apple","banana","kiwi","straberies"};
        List<String> list1 = new ArrayList<String>();
        for(String x: items1) {
            list1.add(x);
        }
        
        String[] items2 = {"banana","straberies"};
        List<String> list2 = new ArrayList<String>();
        for(String y: items2) {
            list2.add(y);
        }
        
        //Print list1 and list2 to test:
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        
        System.out.println();
        
        //editDuplicatedItems Method:
        editDuplicatedItems(list1,list2);
        
      //Print list1 after removing duplicated items:
        for(int i=0; i<list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    private static void editDuplicatedItems(List<String> list1, List<String> list2) {
        
        Iterator<String> items = list1.iterator();
        while(items.hasNext()) {
            if(list2.contains(items.next())) {
                items.remove();
            }
        }
        
    }

}
