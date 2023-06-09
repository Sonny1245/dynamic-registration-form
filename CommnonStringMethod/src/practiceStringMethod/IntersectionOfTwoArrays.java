package practiceStringMethod;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,4,8,9};
        
        printIntersectionElement(arr1, arr2);

    }

    private static void printIntersectionElement(int[] arr1, int[] arr2) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0; i<arr1.length; i++) {
            hs.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++) {
            if(hs.contains(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }
        
    }

}
