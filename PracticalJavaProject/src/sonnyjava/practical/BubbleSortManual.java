package sonnyjava.practical;

import java.util.Arrays;

public class BubbleSortManual {

    public static void main(String[] args) {
        //Bubble sort manually9
        
        int a[]= {12,3, 68,72,4,2,99,89,56,100};
        
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        
        //Double looping here:
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        
        System.out.println("Array after sorting: "+ Arrays.toString(a));

    }

}
