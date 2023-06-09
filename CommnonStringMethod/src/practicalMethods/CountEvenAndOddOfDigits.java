package practicalMethods;

public class CountEvenAndOddOfDigits {

    public static void main(String[] args) {
        
        int num = 12345678;
        int evenCount =0;
        int oddCount =0;
        
        while(num >0) {
            int rem = num%10;
            if(rem%2 ==0) {
                evenCount++;
            }else {
                oddCount++;
            }
            num /=10;
        }
        
        System.out.println("Even Digits Count: " + evenCount);
        System.out.println("Odd Digits Count: " + oddCount);

    }

}
