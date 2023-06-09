
public class FindMissingElementInAnArray {

    public static void main(String[] args) {
       
        int a1[] = {1,3,4,5,6,7,8};
        int result1 = missingElement(a1);
        System.out.println("Missing Element in array of a1 is: " + result1 );
        
        int a2[] = {2, 1, 5, 6, 3};
        int result2 = missingElement(a2);
        System.out.println("Missing Element in array of a2 is: "+ result2 );

    }
    
    public static int missingElement(int arr[]) {
        
        int n = arr.length +1;
        int sumRange = n*(n+1)/2;
        //System.out.println("SumRange is: "+sumRange);
        int currentSum =0;
        
        for(int i=0; i<arr.length; i++) {
            currentSum += arr[i];
        }
        //System.out.println("currentSum is: "+currentSum);
        int missingNumber = sumRange - currentSum;
        
        return missingNumber;
        
    }

}
