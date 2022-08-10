package sonny.java.collections;

import java.util.*;

public class AddArrayToList {

    public static void main(String[] args) {
        
        
        String[] arr = {"one", "two", "three"};
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("four");
        list.add("five");
        list.add("six");
        
        System.out.println("Original List: ");
        for(String x: list)
            System.out.printf("%s ", x);
        
        System.out.println();
        
        Collections.addAll(list, arr);
        
        System.out.println("After adding the array to the list: ");
        for(String x: list)
            System.out.printf("%s ", x);
        
        System.out.println();
        
        Collections.reverse(list);
        for(String x: list)
            System.out.printf("%s ", x);
        
        System.out.println();

    }

}
