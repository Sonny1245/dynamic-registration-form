package com.password;

public class PasswordString {

    public static void main(String[] args) {
        
        First for String:
            
            System.out.print("Original String password value: ");
            System.out.println(stringPassword);
            System.out.println("Original String password hashCode: "
              + Integer.toHexString(stringPassword.hashCode()));

            String newString = "********";
            stringPassword.replace(stringPassword, newString);

            System.out.print("String password value after trying to replace it: ");
            System.out.println(stringPassword);
            System.out.println(
              "hashCode after trying to replace the original String: "
              + Integer.toHexString(stringPassword.hashCode()));
            Copy
            The output will be:

            Original String password value: password
            Original String password hashCode: 4889ba9b
            String value after trying to replace it: password
            hashCode after trying to replace the original String: 4889ba9b
            Copy
            Now for char[]:

            char[] charPassword = new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};

            System.out.print("Original char password value: ");
            System.out.println(charPassword);
            System.out.println(
              "Original char password hashCode: " 
              + Integer.toHexString(charPassword.hashCode()));

            Arrays.fill(charPassword, '*');

            System.out.print("Changed char password value: ");
            System.out.println(charPassword);
            System.out.println(
              "Changed char password hashCode: " 
              + Integer.toHexString(charPassword.hashCode()));
            Copy
            The output is:

            Original char password value: password
            Original char password hashCode: 7cc355be
            Changed char password value: ********
            Changed char password hashCode: 7cc355be
            Copy
            As we can see, after we tried to replace the content of original String, the value remains the same and hashCode() method didn't return a different value in the same execution of the application, meaning that the original String stayed intact.


    }

}
