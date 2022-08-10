package sonny.java.collections;

import java.util.*;

public class AFewCollectionsMethods {

    public static void main(String[] args) {
        
        Character[] ray = {'s','o','n','n','y'};
        List<Character> list = Arrays.asList(ray);
        System.out.println("Original list: ");
        outPut1(list);
        
        //Reverse the list:
        Collections.reverse(list);
        System.out.println("Reverse List: ");
        outPut1(list);
        
        //Let's create a new array, then copy list over new listCopy:
        Character[] newRay = new Character[5];
        List<Character> copyList = Arrays.asList(newRay);
        Collections.copy(copyList, list);
        System.out.println("Copy List: ");
        outPut1(copyList);
        
        //fill Collections method is very similar to Replace method:
        Collections.fill(list, 'K');
        System.out.println("After filling the list: ");
        outPut1(list);
        

    }

    private static void outPut1(List<Character> list) {
        // TODO Auto-generated method stub
        
    }

    private static void outPut(List<Character> theList) {
        
        Iterator<Character> it = theList.iterator();
        
        while(it.hasNext())
            System.out.printf("%s " , it.next());
        
        System.out.println();
        
        //Or you can do the enhanced loop here with no problem.
        
    }

}
