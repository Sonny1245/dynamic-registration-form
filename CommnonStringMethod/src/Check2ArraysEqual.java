
import java.util.Arrays;

public class Check2ArraysEqual {

    public static void main(String[] args) {
        
        int a1[] = {2,3,4,5};
        int a2[] = {1,2,3,4,5,};
        
        //Approach 1: Arrays.equals Method:
       /* boolean statusCheck = Arrays.equals(a1, a2);
        
        if(statusCheck == true) {
            System.out.println("Two arrays are equal.");
        }else {
            System.out.println("Two arrays are NOT equal");
        } */
        
        //Approach 2: Logic Only..
        
        boolean isEqual = true;
        
        if(a1.length == a2.length) {
            for(int i=0; i<a1.length; i++) {
                if(a1[i] != a2[i])
                    isEqual = false;
            }
            
        }else {
            isEqual = false;
        }
        
        if(isEqual == true) {
            System.out.println("Two arrays are equal.");
        }else {
            System.out.println("Two arrays are not equal.");
        }
             
    }

}
