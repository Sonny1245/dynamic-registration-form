package practiceStringMethod;

import java.util.Arrays;
import java.util.LinkedList;

public class ConverArrayToListAndListToArray {

    public static void main(String[] args) {
        
        
        String[] arr = {"one", "two", "three", "four"};
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(arr));
        
        list.addFirst("zero");
        list.addLast("five");
        
        //Now let convert List back to Array:
        arr = list.toArray(new String[list.size()]);
        for(String x: arr) {
            System.out.printf("%s ", x);
        }
       
        System.out.println();
    }

}
