package sonnyjava.learning;

import java.util.Random;

public class CreateRandomPhoneNumbers {

    public static void main(String[] args) {
        //Create a random phone numbers by following rules:
        //FirstSet of 3 numbers >8 or 9, SecondSet > 742, 
        //In the form of: xxx-xxx-xxxx
        
        Random random = new Random();
        
        int first = random.nextInt(8);
        int second = random.nextInt(8);
        int third = random.nextInt(8);
        int middle = random.nextInt(742);
        int last = random.nextInt(9999);
        
        String middleString;
        String lastString;
        
        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);
        
        while(middleString.length() < 3) {
            middleString = "0" + middleString;
        }
        
        while(lastString.length() < 4) {
            lastString = "0" + lastString;
        }
        
        System.out.print("Random Phone Number has been created: ");
        System.out.println(Integer.toString(first) + Integer.toString(second)+
          Integer.toString(third) + "-" + middleString + "-"+ lastString);
        
        
    }

}
