import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {
        
        int a[]= {4, 5, 1, 2,3 ,6,9};
        
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        
        //Approach 1: Using Arrays.paralleSort();
        
        //Arrays.parallelSort(a);
        //System.out.println("Array after sorting: "+ Arrays.toString(a));
        
        //Approach 2: Using Arrays.sort();
        
        //Arrays.sort(a);
        //System.out.println("Array after sorting: "+ Arrays.toString(a));
        
        
        //Approach 3: Using Collections.sort();
        //Collections.sort() has to be in ArrayList();  
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //Convert Array to List;
       /* for(int l: a) {
            list.add((l));
        }
        
        Collections.sort(list);
        
        System.out.println(list);
        */
       
      //Aprroach 4: Logic
        
        for(int i=0; i<a.length-1; i++) {
            for(int j = i+1; j<a.length-1; j++) {
                if(a[i]> a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("Array after sorting: "+ Arrays.toString(a));
        
        for(int k= a.length-1; k>=0;k--) {
            System.out.print(a[k] + " ");
            
        }
        
        //System.out.println(Arrays.toString(a));
        
        System.out.println(); 
    }

}
