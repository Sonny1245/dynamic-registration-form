package practicalMethods;

public class CountNumbersOfDigits {

    public static void main(String[] args) {
        
        int num = 123456;
        int count =0;
        
        while(num >0) {
            num /=10;
            count++;
        }
        System.out.println("Number of Digits: " + count);
    }

}
