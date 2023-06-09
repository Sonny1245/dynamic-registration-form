package sonnyjava.learning;

import java.util.Scanner;
import java.util.Random;

public class StringManapulationJava {

    public static void main(String[] args) {
        //Write a program that prompts for and reads the user's first and last name (separately).
        //Then print a string composed of the first letter of the user's first name,
        //followed by the first five characters of the user's last name, followed 
        //by a random number in the range 10 to 99. Assume the last name is at least five letters long.

        String firstName;
        String lastName;
        String name;
        
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        firstName = sc.next();
        System.out.println("Enter last name: ");
        lastName = sc.next();
        
        while(lastName.length() < 5) {
            System.out.println("Last name must be at least 5 characters long, please try again: ");
            lastName = sc.next();
        }
        
        sc.close();
        
        //chop off the first letter of firstName:
          name = firstName.substring(0,1);
        //Then concat the first letter to lastname:
          name += lastName.substring(0,6);
        //Then attach to random numbers:
          name += ran.nextInt(99) + 10;
        
        
        
        System.out.println(" Final Name is: " + name);
        
        
    }

}
