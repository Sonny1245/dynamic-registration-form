package sonnyjava.learning;

import java.util.*;
public class HashSetExample {

    public static void main(String[] args) {
        // HashSet does not accept duplicated item in the list
        
        
        HashSet<String> hashSet = new HashSet<String>();
        
        hashSet.add("Tom");
        hashSet.add("Tony");
        hashSet.add("John");
        hashSet.add("Tony");
        
        //System.out.println(hashSet );
        
        if(hashSet.contains("Above")) {
            
            for(String i: hashSet) {
                System.out.println("Name: "+ i);
            }
            
        }else {
            System.out.println("No name in the list!");
        }
    }

}
