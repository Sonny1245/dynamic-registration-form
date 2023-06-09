package practicalMethods;

import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of numbers: ");
        int num = sc.nextInt();
        
        /*
         * //Logic 1: int revNum = 0;
         * 
         * while(num !=0) {
         * 
         * revNum = revNum*10 + num%10; num = num /10;
         * 
         * }
         */
        
        /*
         * //Logic 2: Using StringBuffer method build-in: StringBuffer sb = new
         * StringBuffer(String.valueOf(num)); StringBuffer revNum = sb.reverse();
         */
        
        //Logic 3: Using StringBuider:
        
        StringBuilder sb = new StringBuilder();
        StringBuilder revNum = sb.append(num).reverse();
        
        System.out.println("Reversed Number is: " + revNum);

    }

}
