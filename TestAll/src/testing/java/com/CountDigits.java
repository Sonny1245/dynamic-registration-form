package testing.java.com;

public class CountDigits {

    public static void main(String[] args) {
        
        
        int num = 12345678;
        int count = 0;
        
        while(num > 0) {
            num /=10;
            count++;
        }
        
        System.out.println("Total Digits: "+ count);
    }

}
