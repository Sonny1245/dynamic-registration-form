package genericmethods.com;

public class GenericMethodReturnType {

    public static void main(String[] args) {
        // Generic Method with return type:
        
        //Call generic method here:
        System.out.println("Max value: " + maxValue(12, 45, 38));
        System.out.println("Max String: "+ maxValue("we", "are", "here"));
        
    }
    
    
    public static <T extends Comparable<T>> T maxValue(T a, T b, T c) {
        
        T max = a; //Assuming the max value equals to a first
        
        if(b.compareTo(a)> 0)
            max = b;
        if(c.compareTo(max) > 0)
            max = c;
        
        return max;
        
    }

}
