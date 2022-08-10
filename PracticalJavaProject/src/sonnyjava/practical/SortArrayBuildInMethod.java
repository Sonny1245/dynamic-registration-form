package sonnyjava.practical;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayBuildInMethod {

    public static void main(String[] args) {
        
        /*int a[] = {30,10,40,55,50,60,25};
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array after sorting: "+ Arrays.toString(a)); */
        
        Integer a[] = {30,10,40,55,50,60,25};
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array after sorting Ascending: "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array after sorting Descending: "+ Arrays.toString(a)); 
        
        

    }

}
