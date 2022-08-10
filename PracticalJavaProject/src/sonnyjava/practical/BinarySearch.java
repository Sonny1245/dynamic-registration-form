package sonnyjava.practical;

public class BinarySearch {

    public static void main(String[] args) {
        
        //Array must be sorted
        //keySearch == mid (key found)
        //keySearch > mid (move low = mid+1 to the right)
        //keySearch < mid (move high = mid-1 to the left)
        
        int arr[] = {10,20,30,45,80,85,90,100};
        
        int low = 0;
        int high = (arr.length-1);
        
        int keySearch = 100;
        
        boolean flag = false;
       
        
        while(low <= high) {
            
            int mid = (low+high)/2; //index of an array
            
            if(keySearch == arr[mid]) {
                System.out.println(keySearch + " is found at the position "+ mid);
                flag = true;
                break;
            }else if(keySearch > arr[mid]) {
                low = mid+1;
            }else {
                high = mid-1;
            }
            
        }
        if(flag == false) {
            System.out.println("Key Search Element is NOT found!");
        }
        

    }

}
