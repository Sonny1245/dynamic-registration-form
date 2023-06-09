import java.util.HashSet;

public class FindDuplicatedElements {

    public static void main(String[] args) {
        
        String arr[]= {"java","C", "python", "react", "java"};
        
        //Approach 1: Logic: Need 2 loops:
        
       /* boolean flag = false;
        
        for(int i=0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]== arr[j]) {
                    System.out.println("Duplicated Element found: "+ arr[i]);
                    flag = true;
                }
            }
        }
        
        if(flag == false) {
            System.out.println("Duplicated Element is not found at all!");
        }*/
        
        //Approach 2: Using HashSet Collection:
        
        boolean flag = false;
        //Create a HashSet and convert array above to HashSet:
        //HashSet will not allowed duplicated element and return false if found
        HashSet<String> ele = new HashSet<String>();
        
        //Convert array to HashSet Collection:
        for(String l: arr) {
            if(ele.add(l) == false) {
                System.out.println("Duplicated Element found: "+l);
                flag = true;
            }
        }
        if(flag == false) {
            System.out.println("Duplicated Element is not found in the array.");
        }

    }

}
