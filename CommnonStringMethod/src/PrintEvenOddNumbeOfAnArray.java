
public class PrintEvenOddNumbeOfAnArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11};
        
        System.out.println("Even Numbers in the array are: ");
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==0) {
                System.out.println(a[i]);
            }
            
        }
                
          System.out.println("Odd Numbers in the array are: "); 
          for(int i=0;i<a.length; i++) { 
              if(a[i]%2!=0) {
              System.out.println(a[i]); 
              } 
          }       

    }

}
