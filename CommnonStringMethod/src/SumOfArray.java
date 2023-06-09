
public class SumOfArray {

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6};
        int sum =0;
        
        /*
         * for(int i=0; i<a.length; i++) { sum = sum + a[i]; }
         * 
         * System.out.println(sum);
         */
        
        for(int x: a) {
            sum = sum + x;
        }
        System.out.println(sum);

    }

}
