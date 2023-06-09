package practiceStringMethod;

import java.util.*;

public class ArrayListInteger {

    public static void main(String[] args) {
        
        Integer[] arrayInt1 = {1,2,3,4,5,6,7,8,9};
        List<Integer> listInt1 = new ArrayList<Integer>();
        for(Integer x: arrayInt1) {
            listInt1.add(x);
        }
        
        Integer[] arrayInt2 = {4,5,6,7};
        List<Integer> listInt2 = new ArrayList<Integer>();
        for(Integer y: arrayInt2) {
            listInt2.add(y);
        }
        
        //Print out listInt1:
        System.out.println("Original List1 of Integers: ");
        for(int i=0; i<listInt1.size(); i++) {
            System.out.printf("%d ", listInt1.get(i));
        }
        
        System.out.println();
        editList(listInt1, listInt2);
        
      //Print out listInt1 after removing duplicated integer from listInt2:
        System.out.println("List1 after removing duplicated integers: ");
        for(int i=0; i<listInt1.size(); i++) {
            System.out.printf("%d ", listInt1.get(i));
        }

    }
    
    public static void editList(List<Integer> l1, List<Integer> l2) {
        
        Iterator<Integer> numInt = l1.iterator();
        
        while(numInt.hasNext()) {
            if(l2.contains(numInt.next())) {
                numInt.remove();
            }
        }
    }

}
