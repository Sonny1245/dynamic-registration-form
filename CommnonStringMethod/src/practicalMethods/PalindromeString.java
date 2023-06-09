package practicalMethods;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        
        String str = sc.nextLine();
        String origStr = str;
        String revStr = "";
        
        for(int i = str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        
        if(origStr.compareTo(str) == 0) {
            System.out.println(origStr + " is a Palindrome String.");
        }else {
            System.out.println(origStr + " is NOT a Palindrome String!");
        }
        
    }

}
