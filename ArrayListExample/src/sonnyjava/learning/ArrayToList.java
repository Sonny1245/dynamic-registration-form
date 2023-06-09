package sonnyjava.learning;

import java.util.*;

public class ArrayToList {

    public static void main(String[] args) {
       String[] arr1 = {"one", "two", "three"};
       //Convert Array to List
       List<String> list1 = new ArrayList<String>();
       for(String x: arr1) {
           list1.add(x);
       }
       
       String[] arr2 = {"two"};
       List<String> list2 = new ArrayList<String>();
       for(String y: arr2) {
           list2.add(y);
       }
       
       
       //Print out List1:
       for(int i =0; i<list1.size();i++) {
           System.out.printf("%s ", list1.get(i));
       }
       
       System.out.println();
       //Function call:
       editList(list1,list2);
       
     //Print out List1 after editing:
       for(int i =0; i<list1.size();i++) {
           System.out.printf("%s ", list1.get(i));
       }
       
       System.out.println();

    }

    public static void editList(List<String> list1, List<String> list2) {
        
        Iterator<String> it = list1.iterator();
        
        while(it.hasNext()) {
            if(list2.contains(it.next())) {
                it.remove();
            }
            
        }
    }

}
