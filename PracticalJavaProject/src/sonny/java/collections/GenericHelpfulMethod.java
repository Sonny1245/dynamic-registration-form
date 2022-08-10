package sonny.java.collections;

public class GenericHelpfulMethod {

    public static void main(String[] args) {
        
        // Generic Method to check the maximum values for any type of data
        
        
        String result = checkMaxValue("chicken", "titoys", "quela"); 
        
        System.out.println("Max is: " + result);
        
        

    }
    
    public static <T extends Comparable<T>> T checkMaxValue(T a, T b, T c) {
               
        T max = a;
        
        if(b.compareTo(a) > 0)
            max = b;
        
        if(c.compareTo(max) > 0)
            max = c;
        
        return max;
    }

}
