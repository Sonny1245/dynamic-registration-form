package practicalMethods;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Prime number > 1 and only has 2 factors(divisible by 1 and itself)
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        
        int count = 0;
        
        if(num >1) {
            
            for(int i=1; i<=num; i++) {
                
                if(num%i==0)
                    count++;        
            }
            if(count == 2) {
                System.out.println(num + " is a prime number.");
            }else {
                System.out.println(num + " is NOT a prime number!");
            }
                    
        }else {
            System.out.println("Not a prime number!");
        }

    }

}
