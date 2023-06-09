package practiceStringMethod;

public class SumArrReturn {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        
         int result = returnSum(arr);
         
         int ans = result*10;
         
         System.out.println(ans);

    }

    public static int returnSum(int[] arr) {
        
        int sum = 0;
       
      //int myArr[] = new int[arr.length];
        
        for(int i=0; i<arr.length;i++) {
            sum=sum+arr[i];
          
        }
        
        
        return sum;
      
        
    }

}
