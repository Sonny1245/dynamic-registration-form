package practicalMethods;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        
        /*
         * String revStr = "";
         * 
         * for(int i = str.length() -1; i>=0; i--) { revStr = revStr + str.charAt(i);
         * 
         * }
         */
        
        /*
         * StringBuffer sb = new StringBuffer(str); StringBuffer revStr = sb.reverse();
         */
        
        StringBuilder sb = new StringBuilder();
        StringBuilder revStr = sb.append(str).reverse();
        System.out.println("Reversed String: " + revStr);

    }

}
