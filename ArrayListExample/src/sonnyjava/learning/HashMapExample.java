package sonnyjava.learning;

import java.util.*; 

public class HashMapExample {

    public static void main(String[] args) {
        //HashMap: key/value pair and use the put method to add items
        
        HashMap<String, String> capacities = new HashMap<String, String>();
        
        capacities.put("USA", "Washington");
        capacities.put("Vietnam", "Ha Noi");
        capacities.put("California", "Sacramento");
        
        //System.out.println(capacities);
        
        //Enhanced Loop: to get the keys
        for(String i: capacities.keySet()) {
            System.out.println("Key: "+ i);
        }
        
        System.out.println("++++++++++++++++++");
        
        //To get values:
        for(String j: capacities.values()) {
            System.out.println("Values: "+ j);
        }
        
        System.out.println("------------------");

        //To get the keys and values:
        for(String k: capacities.keySet()) {
            System.out.println(k +"\t\t"+ capacities.get(k));
        }
        
        
        
    }

}
