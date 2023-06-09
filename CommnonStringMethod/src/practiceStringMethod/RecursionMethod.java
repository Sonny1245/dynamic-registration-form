package practiceStringMethod;

import java.util.Scanner;

public class RecursionMethod {

    public static void main(String[] args) {
        
        String choice = "y";
        
        while(choice.equalsIgnoreCase("y")) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            long result = factorial(num);
            System.out.println(num + "! = " + result);
       
            //User input choice:
            System.out.print("Would you like to enter another number? [Y/N]: ");
            choice = sc.next(); 
                     
        }
        
        System.out.println("Thanks for playing...");
        
    }
    
    public static long factorial(long n) {
        if(n <= 1)
            return 1;
        else
            return n * factorial(n-1);
    }

}
