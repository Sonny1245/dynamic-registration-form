package sonnyjava.learning;

public class OverLoadedMethods {

    public static void main(String[] args) {
        
        
        Integer[] iray = {1,2,3,4,5};
        
        Character[] cray = {'s', 'o', 'n'};
        
        printMe(iray);
        printMe(cray);

    }

    private static <T> void printMe(T[] x) {
        
        for(T y: x) {
            System.out.printf("%s ", y);
        
        
           
        }
        
      System.out.println();
        
    }

    

}
