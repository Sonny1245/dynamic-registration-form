import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        
        
        int a[] = {1,2,3,4,5,6,7,8,9,10}; //Array must be sorted in order
        
        
        //Approach 1: Logic
       /* boolean flag = false;
        int low = 0;
        int high = a.length -1;
        
        int keySearch = 10;
        
        while(low <= high) {
            
            int mid = (low+high)/2; //mid is an index of the array
            
            if(a[mid]==keySearch) {
                System.out.println("Element number " +a[mid] + " is found at the position: " + mid);
                flag = true;
                break;
            }else if(a[mid]<keySearch) {
                
                low = mid +1;
                
            }else {
                high = mid -1;
            }
        }
        
        if(flag == false) {
            System.out.println("Element is not found in the array at all!");
        } */
        
        //Approach 2: Using Arrays.binarySearch();
        
        //Note: binarySearch() will return an index if element is found
        //if not found will return a negative number
        
        int index = Arrays.binarySearch(a, 10);
        
        if(index < 1) {
            System.out.println("Element is not exist in the array at all.");
        }else {
            System.out.println("Element is found at the position of: "+ index);
        }
        
    }

}
