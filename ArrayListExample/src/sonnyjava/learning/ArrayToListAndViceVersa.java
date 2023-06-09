package sonnyjava.learning;

import java.util.*;

public class ArrayToListAndViceVersa {

    public static void main(String[] args) {
        
        
        String[] arr = {"no", "yes", "nada"};
        //Convert Array to List:
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(arr));
        
        //Added in some items with the LinkedList Methods:
        list.add("que");
        list.addFirst("firstItem");
        list.addLast("lastItem");
        
        //Now Convert the List back to an Array with new items in it:
        arr = list.toArray(new String[list.size()]);
        
        //Loop through an array:
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //System.out.println();
    }

}
