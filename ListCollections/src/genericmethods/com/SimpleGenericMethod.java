package genericmethods.com;

public class SimpleGenericMethod {

    public static void main(String[] args) {
        //Generic Methods: to solve the overloading methods
        
        String[] strArray = {"one", "two", "three"};
        Integer[] inArray = {1,2,3,4,5};
        
        displayOutPut(strArray);
        displayOutPut(inArray);

    }
    
    public static <T> void displayOutPut(T[] x) {
        for(T b: x) {
           System.out.printf("%s ", b + " ");
        }
        
        System.out.println();
    }

}
