package practicalMethods;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a series of numbers: ");
        int num = sc.nextInt();
        
        int originNum = num;
        int revNum = 0;
        
        while(num != 0) {
            revNum = revNum*10 + num%10;
            num /=10;
        }
         
        if(originNum == revNum) {
            System.out.println(originNum + " is a Palindrome Number.");
        }else {
            System.out.println(originNum + " is Not a Palindrome Number!");
        }

    }

}
